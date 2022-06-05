package GoF.additional.Filter;

import java.util.List;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:09
 * @Version 1.0
 */

/**
 * 过滤器模式/标准模式Criteria
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
