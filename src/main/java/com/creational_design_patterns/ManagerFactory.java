package com.creational_design_patterns;

public class ManagerFactory extends AbstractFactory {
    @Override
    public Worker createWorker(String workerType) throws Exception {
        switch (workerType) {
            case "technicalManager":
                return new TechnicalManager();
            case "administrativeManager":
                return new AdministrativeManager();
            default:
                String errorMessage = String.format("Invalid worker type %s", workerType);
                throw new Exception(errorMessage);
        }
    }
}
