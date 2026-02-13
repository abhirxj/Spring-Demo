package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            //Dev obj = (Dev)context.getBean("dev");
            //or use this
            Dev ob = context.getBean(Dev.class);
            ob.build();

            //System.out.println(obj.getBranch());
            //System.out.println(obj.getAge());


    }

}
