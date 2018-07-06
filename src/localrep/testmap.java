/**
 * 
 */
package localrep;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 谷春
 *
 */
public class testmap {
    public static void main(String[] args) {
       HashMap<Integer,Integer> aa = new HashMap();
       aa.put(11, 22);
       aa.put(33, 44);
       for(Map.Entry<Integer,Integer> ee: aa.entrySet()){
           System.out.println(ee.getKey() +"    "+ ee.getValue());
       }
    }
}
