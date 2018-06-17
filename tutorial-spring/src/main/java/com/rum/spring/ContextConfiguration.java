package com.rum.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {


    @Bean
    public InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor(){
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }

    @Bean
    public TerminatorQuoter terminatorQuoter(){
        TerminatorQuoter terminatorQuoter = new TerminatorQuoter();
        terminatorQuoter.setMessage("Hello world!");
        return terminatorQuoter;
    }
}
