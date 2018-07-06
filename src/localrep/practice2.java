/**
 * 
 */
package localrep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;


/**
 * @author 谷春
 *
 */
public class practice2 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
    practice2 practice2 = new practice2();
    //practice2.obj();
    PriorityQueue pq = new PriorityQueue();
    pq.offer(6);
    //pq.add(-3);
    //pq.add(20);
    pq.offer(18);
    pq.offer(30);
    pq.offer(5);
    //输出：[-3, 6, 20, 18]
    System.out.println(pq);
}

public void copy() throws IOException {
    File file = new File("D:/work/测试git/localrep/test.png");
    File file1 = new File("D:/work/测试git/localrep/test4.png");
    InputStream inputStream = new FileInputStream(file);
    OutputStream outputStream = new FileOutputStream(file1);
    byte temp[] = new byte[1024];
    int num = 0;
    while ((num = inputStream.read(temp)) != -1) {
        outputStream.write(temp);
    }
    inputStream.close();
    outputStream.close();
}

public void file() throws IOException {
    File file = new File("D:/work/测试git/localrep/learn");
    file.mkdir();
    File file1 = new File("D:/work/测试git/localrep/learn/test.txt");
    file1.createNewFile();
    System.out.println(file1.getTotalSpace()/(1024*1024*1024));
    System.out.println(file1.getName());
    System.out.println("文件父目录字符串 " + file1.getParent());
    System.out.println(file1.getParentFile());
}

public void obj() throws FileNotFoundException, IOException, ClassNotFoundException {
    student students[] = {new student("sam", 33),new student("kassdao",22),new student("dean",11)};
    student studentss[] = new student[5];
    List<student> aa = new ArrayList<student>();
    File file = new File("D:/work/测试git/localrep/learn/test.txt");
    
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
    int num = 0;
    for (student student : students) {
        objectOutputStream.writeObject(student);
    }
    objectOutputStream.close();
    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
    for (int i=0; i < students.length; i++ ) {
        
        aa.add((student) objectInputStream.readObject()) ;
        //System.out.println(studentss[i]);
    }
//    for (student student : aa) {
//        System.out.println(student);
//    }
    Iterator<student> iterable =  aa.iterator();
    while (iterable.hasNext()) {
        System.out.println(iterable.next());
        
    }
}
}
