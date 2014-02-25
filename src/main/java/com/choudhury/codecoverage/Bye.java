package com.choudhury.codecoverage;

public class Bye{

    public Bye(){
        System.out.println("Constructor line covered");
    }

    public void sayIt(String lang){
        if (lang.equals("en")){
            System.out.println("Bye");
        }
        else{
            System.out.println("Au Revoir");
        }
    }
}