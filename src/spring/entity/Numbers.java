package spring.entity;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Numbers {

    private int[] num;

    private List list;

    private Map map;

    private Set set;

}
