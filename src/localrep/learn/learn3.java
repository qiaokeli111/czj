/**
 * 
 */
package localrep.learn;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;
import java.util.Vector;

/**
 * @author 谷春
 *
 */
public class learn3 {
 public void applyRef1(Map<String,Integer> map,Vector<Date> v){
        
    }
     
    public static void main(String[] args) {
        try {
            Method method = learn3.class.getMethod("applyRef1", Map.class,Vector.class) ;
             
            Type[] pType = method.getParameterTypes();
             
            Type[] neiType = method.getGenericParameterTypes();
             
            System.out.println(pType[0]) ;
            System.out.println(pType[1]) ;
             
            System.out.println(neiType[0]) ;
            System.out.println(neiType[1]) ;
            
            ParameterizedType pwwType = (ParameterizedType) neiType[0];
            System.out.println(pwwType.getRawType());
            System.out.println(pwwType.getActualTypeArguments()[0]);
            System.out.println(pwwType.getActualTypeArguments()[1]);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}
}
