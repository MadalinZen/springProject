package com.sda.example.production;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstProject {

    public static void main(String[] args) {

        String  [] beans = new String [] {"tools.xml" , "worker.xml"} ;

        // ClassPathResource is going to be used to load definitions

        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);

        Worker testWorker = xmlApplicationContext.getBean(Worker.class);




    }
}
