package rum.com;


import org.junit.Test;

import javax.swing.*;
import java.util.Comparator;

/**
 * Unit test for simple App.
 */
public class AppTest {


    private Integer x = 10;

    public static void main(String [] args){

        Timer t = new Timer(3000,System.out::print);
        t.start();
    }


    @Test
    public void testInt(){
        setInteger(x);
        System.out.println(x );
    }

    @Test
    public void testClassStudent(){

        Timer t = new Timer(100000,(event) -> System.out.println(event));
        t.start();
        t.start();
        System.out.println("finish");

    }




    private void setInteger(Integer i){

        i = 5;
    }




}

interface Person {

    String getName();

}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

class Student extends StudentComparator{




}
