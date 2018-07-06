/**
 * 
 */
package localrep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * @author 谷春
 *
 */
public class practiceIO {
public static void main(String[] args) throws IOException{
    practiceIO aa = new practiceIO();
    //aa.output();
    aa.input();
}
    public void output() throws IOException{
        File f = new File("D:/work/测试git/localrep/iopractice.txt");
        FileOutputStream outputStream = new FileOutputStream(f,true);
        //OutputStream out=new FileOutputStream(f);
        String aa = "\r\n222";
        byte bb[] = aa.getBytes();
        outputStream.write(bb);
        outputStream.close();
    }
    
    public void input() throws IOException {
        File f = new File("D:/work/测试git/localrep/iopractice.txt");
        InputStream inputStream = new FileInputStream(f);
        byte bb[] = new byte[125];
        int aa = inputStream.read(bb);
        
            
        System.out.println(new String(bb));
//        System.out.println(Arrays.toString(bb));
//        System.out.println(bb.toString());
        inputStream.close();
//        System.out.println(new String(bb,0,aa));
        
    }
    
    public void write() throws IOException {
        File f = new File("D:/work/测试git/localrep/iopractice.txt");
        Writer writer = new FileWriter(f,true);
        String aa = "我问问";
        writer.write(aa);
        writer.close();
    }
    public void read() throws IOException {
        File f = new File("D:/work/测试git/localrep/iopractice.txt");
        Reader reader = new FileReader(f);
        char c[] = new char[(int)f.length()];
        reader.read(c);
        System.out.println(new String(c));
        reader.close();
    }
    
}
