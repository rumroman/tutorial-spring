package com.rum.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTests {


    @Autowired
    InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor;
    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    private AnnotationConfigApplicationContext annotationConfigApplicationContext;



    @Before
    public void setUp(){
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.rum.spring");
        //classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
    }


    @Test
    public void testSayQuote(){
        //classPathXmlApplicationContext.getBean(Quoter.class).sayQuote();
        annotationConfigApplicationContext.getBean(TerminatorQuoter.class).sayQuote();
    }

}
