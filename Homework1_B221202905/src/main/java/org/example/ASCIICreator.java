/*
Student ID: B221202905
Name: Nurain Fitri binti Madzlan
Course Name: Design Pattern
Homework 1
 */

package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ASCIICreator implements SerializeInterface {

    @Override
    public void prepareData(Student1 myStudent) {

        try {
            byte[] bytes1 = myStudent.getStudentId().getBytes(StandardCharsets.US_ASCII);
            byte[] bytes2 = myStudent.getName().getBytes(StandardCharsets.US_ASCII);
            byte[] bytes3 = myStudent.getSurname().getBytes(StandardCharsets.US_ASCII);

            System.out.println("\n-------------ASCII-----------");
            System.out.println("Student ID: " + myStudent.getStudentId() + " " + "\nAscii Value: " + Arrays.toString(bytes1));
            System.out.println("\n");
            System.out.println("Name: " + myStudent.getName() + " " + "\nAscii Value: " + Arrays.toString(bytes2));
            System.out.println("\n");
            System.out.println("Surname: " + myStudent.getSurname() + " " + "\nAscii Value: " + Arrays.toString(bytes3));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }
