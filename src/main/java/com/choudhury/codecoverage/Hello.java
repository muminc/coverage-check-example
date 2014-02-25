package com.choudhury.codecoverage;

public class Hello{

    public Hello(){
        System.out.println("Constructor line covered");
    }

     public void sayHello(String lang){
         System.out.println("sayHello called");
         if (lang.equals("en")){
             System.out.println("Hello");
         }
         else{
             System.out.println("Bonjour");
         }
     }
}