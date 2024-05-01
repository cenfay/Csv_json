package org.example;


import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.writeString;
import static org.example.parceCSV.listToJson;
import static org.example.parceCSV.parseCSV;
import static org.example.parceXML.parseXML;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = parseCSV(columnMapping, fileName);
        String json = listToJson(list);
        String jsonFileName = "data.json";
        writeString(Path.of(jsonFileName), json);


        List<Employee> employees = parseXML("data.xml");
        String json1 = listToJson(employees);
        writeString(Path.of("data2.json"), json1);

    }
}

