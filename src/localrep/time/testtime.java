/**
 * 
 */
package localrep.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 谷春
 *
 */
public class testtime {
    
    public static void main(String[] args) {
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        SimpleDateFormat sdFormat1 = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Date now = new Date();
        long time = 7*24*60*60*1000;
        Date after = new Date(now.getTime()+time);
        System.out.println(sdFormat1.format(now));
        System.out.println(sdFormat.format(after));
        System.out.println(now.getTime());
    }
}
