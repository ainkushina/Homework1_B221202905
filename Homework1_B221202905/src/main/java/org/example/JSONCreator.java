/*
Student ID: B221202905
Name: Nurain Fitri binti Madzlan
Course Name: Design Pattern
Homework 1
 */

package org.example;

import com.google.gson.Gson;

public class JSONCreator implements SerializeInterface {

    @Override
    public void prepareData(Student1 myStudent) {
        Gson gson = new Gson();
        String gsonString = gson.toJson(myStudent);
        System.out.println("\n-------------JSON-----------");
        System.out.println(gsonString);
    }

}
