/**
 * 
 */
package localrep.learn;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * @author 谷春
 *
 */
public class learn4 {
 public void applyRef1(Map<String,Integer> map,Vector<Date> v){
        
    }
     
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Method mm = learn4.class.getMethod("applyRef1", Map.class,Vector.class);
        Type[] aa = mm.getGenericParameterTypes();
        System.out.println(aa[0]);
        ParameterizedType ad = (ParameterizedType)aa[0];
        System.out.println(ad.getActualTypeArguments()[0]);
        
        Map<String, Integer> ee = new HashMap<String, Integer>();
        
        
        
        
        
}
}
