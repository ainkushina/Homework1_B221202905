/*
Student ID: B221202905
Name: Nurain Fitri binti Madzlan
Course Name: Design Pattern
Homework 1
 */

package org.example;

public class Main {
    public static void main(String[] args) {

        Student1 myStudent = new Student1("2022", "Ain", "Fitri");

        FactoryMethod factory = new FactoryMethod();

        SerializeInterface jsonInterface = factory.createSer("JSON");
        jsonInterface.prepareData(myStudent);

        SerializeInterface asciiInterface = factory.createSer("ASCII");
        asciiInterface.prepareData(myStudent);

    }
}