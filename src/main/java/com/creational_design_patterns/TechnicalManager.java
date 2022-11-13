package com.creational_design_patterns;

public class TechnicalManager implements Worker {
    @Override
    public void getWorkerType() {
        System.out.println("I am a technical manager");
    }
}
