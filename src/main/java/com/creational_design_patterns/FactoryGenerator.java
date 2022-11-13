package com.creational_design_patterns;


public class FactoryGenerator {
    private static FactoryGenerator singleton;

    private FactoryGenerator() {
        // Make constructor not available outside
    }

    public static FactoryGenerator getFactoryGenerator() {
        if (singleton != null) {
            System.out.println("Singleton exists");
            return singleton;
        }

        System.out.println("Singleton generating");
        singleton = new FactoryGenerator();
        return singleton;
    }

    public AbstractFactory getFactory(String baseType) throws Exception {
        switch (baseType) {
            case "blueCollar":
                return new BlueCollarFactory();
            case "whiteCollar":
                return new WhiteCollarFactory();
            case "manager":
                return new ManagerFactory();
            default:
                String errorMessage = String.format("Invalid worker type %s", baseType);
                throw new Exception(errorMessage);
        }
    }
}
