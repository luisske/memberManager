package com.luisske.memberManager.service;

import com.luisske.memberManager.model.Person;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyzationService {

    String filePath = "src/main/resources/members.csv";

    public void readInputFile() {
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader(filePath)).withSkipLines(1)
                .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
                .build()) {

            List<String[]> lines = reader.readAll();

            Map<String, Person> members = new HashMap<>();

            for (String[] lineString : lines) {
                Person person = mapToObject(lineString);
                members.put(person.getName(), person);
            }
            System.out.println(members.size() + " Mitglieder eingelesen.");
            System.out.println(members);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }

    private Person mapToObject(String[] lineString) {
        Person person = new Person();
        person.setName(lineString[0]);
        person.setBirthday(lineString[1]);
        person.setAddress(lineString[2]);
        person.setMobilePhone(lineString[3]);
        person.setPhone(lineString[4]);
        person.setJoining(lineString[5]);
        person.setSeniority(lineString[6]);
        person.setMarriage(lineString[7]);
        return person;
    }
}
