/**
 * 
 */
package localrep.Introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import localrep.member;

/**
 * @author 谷春
 *
 */
public class learn {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IntrospectionException, InstantiationException {
        learn learn = new learn();
        member men = new member();
        men=(member)learn.change();
        System.out.println(men.getName());
        System.out.println(men.getAge());
    }
    
    
    
    
    
    public Object change() throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        Object men =  member.class.newInstance();
        BeanInfo beanInfo = Introspector.getBeanInfo(member.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String name = propertyDescriptor.getName();
            if (name.equals("name")) {
                Method set = propertyDescriptor.getWriteMethod();
                set.invoke(men, "sss");
            }
            if (name.equals("age")) {
                Method set = propertyDescriptor.getWriteMethod();
                set.invoke(men, 13);
            }
        }
        return men;
    }

}
