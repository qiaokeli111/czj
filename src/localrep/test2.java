/**
 * 
 */
package localrep;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 谷春
 *
 */
public class test2 {
    public void aa(List<String> aa) {
        aa.add("asda");
    }
public static void main(String[] args) {
    List<String> aa = new ArrayList<String>();
    test2 ee = new test2();
    ee.aa(aa);
    for(String a:aa){
        System.out.println(a);
    }
}
}
