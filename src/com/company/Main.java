package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<String> participantList = new ArrayList<>();
        participantList.add("Tanya K");
        participantList.add("Darja J");
        participantList.add("Sandija");
        participantList.add("Sanita");
        participantList.add("Kristine B");
        participantList.add("Linda");
        participantList.add("Zanna J");
        participantList.add("Helena P");
        participantList.add("Julija V");
        participantList.add("Sandra");
        participantList.add("Agnese");
        participantList.add("Daiga S");
        participantList.add("Alija J");


        int numOfGroups = participantList.size()/ 3;

        Collections.shuffle(participantList);
        List<List<String>> groups = IntStream.range(0, participantList.size())
                .boxed()
                .collect(Collectors.groupingBy(i -> i % numOfGroups))
                .values()
                .stream()
                .map(il -> il.stream().map(participantList::get).collect(Collectors.toList()))
                .collect(Collectors.toList());

        groups.forEach(System.out::println);




    }//END OF MAIN

}
