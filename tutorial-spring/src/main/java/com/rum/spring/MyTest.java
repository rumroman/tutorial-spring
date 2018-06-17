package com.rum.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {



    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    private AnnotationConfigApplicationContext annotationConfigApplicationContext;




    public void setUp(){
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        //classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
    }



    public void testSayQuote(){
        //classPathXmlApplicationContext.getBean(Quoter.class).sayQuote();
        annotationConfigApplicationContext.getBean(Quoter.class).sayQuote();
    }

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.setUp();
        myTest.testSayQuote();

    }

}

