package spring.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import spring.entity.Numbers;

public class MyBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new Numbers();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
