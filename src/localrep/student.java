/**
 * 
 */
package localrep;

import java.io.Serializable;

/**
 * @author 谷春
 *
 */
public class student implements Serializable{
String name;
int age;

public student(String name,int age) {
    // TODO Auto-generated constructor stub
    this.name = name;
    this.age = age;
}
public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
}
}
