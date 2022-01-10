package spring.autowrite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.core.annotation.Order;
import spring.bean.Orbers;

@Setter
@Getter
@ToString
public class AutoUser {
    private String name;
    private String password;
    private Orbers order;


}
