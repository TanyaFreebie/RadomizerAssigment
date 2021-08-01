package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Project> projectList = new ArrayList<>();
        projectList.add(new Project("1", "jsj"));
        projectList.add(new Project("2", "jjfkpid"));
        projectList.add(new Project("3", "kdwj"));
        projectList.add(new Project("4", "jsj"));
        projectList.add(new Project("5", "jjfkpid"));
        projectList.add(new Project("6", "kdwj"));

        List <Participant> participantList = new ArrayList<>();
        participantList.add(new Participant("a", "b", false));
        participantList.add(new Participant("c", "d", false));
        participantList.add(new Participant("e", "f", false));
        participantList.add(new Participant("g", "h", false));
        participantList.add(new Participant("I", "J", false));
        participantList.add(new Participant("k", "l", false));
        participantList.add(new Participant("m", "n", false));
        participantList.add(new Participant("o", "p", false));
        participantList.add(new Participant("q", "r", false));
        participantList.add(new Participant("s", "t", false));
        participantList.add(new Participant("u", "v", false));
        participantList.add(new Participant("w", "x", false));
        participantList.add(new Participant("y", "z", false));
        participantList.add(new Participant("z", "a", false));

        for(Participant participant : participantList){
            List<Project> projectAssignment = new ArrayList<>();



            if(!participant.isHasAssignment()){
                projectAssignment.add(projectList.get(getRandomProject(projectList)));
                participant.setHasAssignment(true);
                participant.setFinalProject(projectAssignment);

            }
        }

        for(Participant participant : participantList)
            System.out.println(participant.getName() + " " + participant.getSurname() + " will work on project No " + participant.getFinalProject().get(0).getProjectName());





    }//END OF MAIN

//    public static int getRandomPerson(List <Participant> objectList){
//        return (int) (Math.random() * (objectList.size() + 1));
//    }

    public static int getRandomProject(List <Project> objectList){
        return (int) (Math.random() * objectList.size());
    }
}
