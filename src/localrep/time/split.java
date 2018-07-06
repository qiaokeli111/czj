/**
 * 
 */
package localrep.time;

/**
 * @author 谷春
 *
 */
public class split {

    public static void main(String[] args) {
        String ss = "VANKE\\lili;VANKE\\caijr;";
        String[] toUserIDs = ss.split(";");
        
        StringBuffer sf = new StringBuffer();
        for (String string : toUserIDs) {
            sf.append(string + ",");
        }
        String aa = sf.substring(0, 1);
        System.out.println(aa);
        System.out.println("33");
    }
}
