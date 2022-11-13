package com.creational_design_patterns;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {
            FactoryGenerator factoryGenerator = FactoryGenerator.getFactoryGenerator();
            // Available types are: ["blueCollar", "whiteCollar", "manager"]
            AbstractFactory whiteCollarFactory = factoryGenerator.getFactory("whiteCollar");   
            AbstractFactory managerFactory = factoryGenerator.getFactory("manager");
            // Available types are: ["blueCollar", "technicalManager", "administrativeManager", "hrSpecialist", "frontEndDeveloper", "backEndDeveloper", "softwareArchitect"] 
            Worker softwareArchitect = whiteCollarFactory.createWorker("softwareArchitect");
            Worker technicalManager = managerFactory.createWorker("technicalManager");
            Team team = new Team();
            team.assignMemberToTeam(softwareArchitect);
            team.assignMemberToTeam(technicalManager);
            
            // Assign front end developers
            for (int i = 0; i < 2; i++) {
                Worker frontEndDeveloper = whiteCollarFactory.createWorker("frontEndDeveloper");
                team.assignMemberToTeam(frontEndDeveloper);
            }

            // Assign back end developers
            for (int i = 0; i < 8; i++) {
                Worker backEndDeveloper = whiteCollarFactory.createWorker("backEndDeveloper");
                team.assignMemberToTeam(backEndDeveloper);
            }
            
            List<Worker> teamMembers = team.getTeam();

            System.out.println(teamMembers);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
