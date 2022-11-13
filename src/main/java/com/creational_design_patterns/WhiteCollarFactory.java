package com.creational_design_patterns;

public class WhiteCollarFactory extends AbstractFactory {
    @Override
    public Worker createWorker(String workerType) throws Exception {
        switch (workerType) {
            case "hrSpecialist":
                return new HrSpecialist();
            case "backEndDeveloper":
            case "frontEndDeveloper":
            case "softwareArchitect":
                SoftwareSpecialistFactory softwareSpecialistFactory = new SoftwareSpecialistFactory();
                return softwareSpecialistFactory.createWorker(workerType);
            default:
                String errorMessage = String.format("Invalid worker type %s", workerType);
                throw new Exception(errorMessage);
        }
    }
}
