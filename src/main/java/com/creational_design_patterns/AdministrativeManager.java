package com.creational_design_patterns;

public class AdministrativeManager implements Worker {
    @Override
    public void getWorkerType() {
        System.out.println("I am an administrative manager");
    }
}
