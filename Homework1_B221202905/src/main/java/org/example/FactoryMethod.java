/*
Student ID: B221202905
Name: Nurain Fitri binti Madzlan
Course Name: Design Pattern
Homework 1
 */

package org.example;

public class FactoryMethod {

    public SerializeInterface createSer (String serType) {

        if (serType == null || serType.isEmpty())
            return null;
        switch (serType) {
            case "JSON":
                return new JSONCreator();
            case "ASCII":
                return new ASCIICreator();
            default:
                throw new IllegalArgumentException("Unknown Serializer");
        }
    }
}
