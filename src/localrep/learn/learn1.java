/**
 * 
 */
package localrep.learn;

import java.util.Arrays;
import java.util.List;

/**
 * @author 谷春
 *
 */
public class learn1 {
public static void main(String[] args) {
    Integer[] data = {1,2,3,4,5};

    List list = Arrays.asList(data);
    List<Integer>  aa = Arrays.asList(1,2,3,4);

    System.out.println("元素类型：" + list.get(0).getClass());

    System.out.println(list.get(0));
    System.out.println(aa.get(0));
}
}
