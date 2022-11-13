package com.creational_design_patterns;

public class FrontEndDeveloper implements Worker {
    @Override
    public void getWorkerType() {
        System.out.println("I am a front end developer");
    }
}
