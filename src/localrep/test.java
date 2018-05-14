
package localrep;


public class test {
    String aa = "222";
    public void number(String aa) {
        this.aa = aa ;
        System.out.println(aa); 
    }
   public static void main(String[] args) {
    test bb = new test();
    bb.number(bb.aa);

    bb.number("ssss");

    bb.number(bb.aa);

}
}



