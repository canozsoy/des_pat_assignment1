package com.creational_design_patterns;

public class BlueCollarWorker implements Worker {
    @Override
    public void getWorkerType() {
        System.out.println("I am a blue collar worker");        
    }
}
