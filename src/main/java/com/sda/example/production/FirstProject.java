package com.sda.example.production;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstProject {

    public static void main(String[] args) {

        String  [] beans = new String [] {"tools.xml" , "worker.xml"} ;

        // ClassPathResource is going to be used to load definitions

        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);

        Worker testWorker = xmlApplicationContext.getBean(Worker.class);

        System.out.println("testWorker : " + testWorker);

        System.out.println("\n\n" + testWorker);

        Worker worker2 = xmlApplicationContext.getBean(Worker.class);

        System.out.println("worker2 : " + worker2);

//        Tool testTool = xmlApplicationContext.getBean(Tool.class);

      //  System.out.println("testTool : " + testTool);

        WorkerMotto testWorkerMotto = xmlApplicationContext.getBean(WorkerMotto.class);

        System.out.println("testWorkerMotto : " + testWorkerMotto);

        if (testWorker == worker2) {

            System.out.println("Instantele workerilor sunt egale !!! ");
        } else System.out.println("Workers instances are not the same !");

      //  testTool.setName("numeleABC");







    }
}
