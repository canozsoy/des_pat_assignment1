package com.creational_design_patterns;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Worker> team = new ArrayList<Worker>();

    public List<Worker> getTeam() {
        return team;
    }

    public void assignMemberToTeam(Worker newMember) {
        team.add(newMember);
    }
}
