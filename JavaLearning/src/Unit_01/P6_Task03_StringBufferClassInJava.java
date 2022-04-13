package Unit_01;
import java.util.*;

public class P6_Task03_StringBufferClassInJava {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Ap ");
        sb.append("java");
        System.out.println(sb.charAt(0));

        System.out.println(sb);

        // stringBuffer insert() Method
        StringBuffer sb2 = new StringBuffer("Ap ");
        sb2.insert(1, "Java");// now original string is changed
        System.out.println(sb2);// print AJavap

        // strinBuffer replace() method
        StringBuffer sb3 = new StringBuffer("Ap ");
        sb3.replace(1, 3, "Java");
        System.out.println(sb3);

        // stringBuffer delete() method
        StringBuffer sb4 = new StringBuffer("Ap");
        sb4.delete(1, 3);
        System.out.println(sb4);

    }

}
 