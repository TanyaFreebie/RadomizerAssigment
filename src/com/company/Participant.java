package com.company;

import java.util.List;

public class Participant {
    private String name;
    private String surname;
    private boolean hasAssignment;
    private List <Project> finalProject;

    public Participant(String name, String surname, boolean hasAssignment) {
        this.name = name;
        this.surname = surname;
        this.hasAssignment = hasAssignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isHasAssignment() {
        return hasAssignment;
    }

    public void setHasAssignment(boolean hasAssignment) {
        this.hasAssignment = hasAssignment;
    }

    public List<Project> getFinalProject() {
        return finalProject;
    }

    public void setFinalProject(List<Project> finalProject) {
        this.finalProject = finalProject;
    }
}
