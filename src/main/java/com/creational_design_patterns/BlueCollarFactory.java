package com.creational_design_patterns;

public class BlueCollarFactory extends AbstractFactory {
    @Override
    public Worker createWorker(String workerType) throws Exception {
        switch (workerType) {
            case "blueCollar":
                return new BlueCollarWorker();
            default:
                String errorMessage = String.format("Invalid worker type %s", workerType);
                throw new Exception(errorMessage);
        }
    }
}
