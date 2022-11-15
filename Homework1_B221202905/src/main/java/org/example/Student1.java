/*
Student ID: B221202905
Name: Nurain Fitri binti Madzlan
Course Name: Design Pattern
Homework 1
 */

package org.example;

public class Student1 {

    private String studentId;
    private String name;
    private String surname;

    public Student1 (String studentId, String name, String surname) {

        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
    }

    public String getStudentId() {
        return studentId;}

    public void setStudentId(String studentId) {
        this.studentId = studentId;}

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public String getSurname() {
        return surname;}

    public void setSurname(String surname) {
        this.surname = surname;}
}

