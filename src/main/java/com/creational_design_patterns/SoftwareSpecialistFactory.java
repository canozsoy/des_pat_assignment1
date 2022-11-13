package com.creational_design_patterns;

public class SoftwareSpecialistFactory extends AbstractFactory {
    @Override
    protected Worker createWorker(String workerType) throws Exception {
        switch (workerType) {
            case "frontEndDeveloper":
                return new FrontEndDeveloper();
            case "backEndDeveloper":
                return new BackEndDeveloper();
            case "softwareArchitect":
                return new SoftwareArchitect();
            default:
                String errorMessage = String.format("Invalid worker type %s", workerType);
                throw new Exception(errorMessage);
        }
    }
}
