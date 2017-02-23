package com.choudhury.codecoverage;

import org.junit.Test;

public class HelloTest {

    @Test
    public void testHello() throws Exception{


        // If you want to understand how jacoco works, then run 'mvn clean install' from the command line so that this test will run
        // and you can inspect the surefire argline to understand how jacoco works...
        System.out.println("Thread.sleep of 60 seconds added to give chance to launch 'jvisualvm' to " +
                "inspect the full java argLine for SureFire ");
       Thread.sleep(60000);

        Hello hello=new Hello();
        hello.sayHello("en");

        // ensure that the code coverage check fails,
        // then uncomment the line below to make it pass.

        //hello.sayHello("fr");
    }
}
