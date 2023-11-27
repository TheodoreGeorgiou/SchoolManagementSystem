package org.theo.dto;

/**
 * Student and their information
 * @author Theodore Georgiou
 */

public class Student {
    private String id;
    private String fname;
    private String lname;
    private Course[] courses;
    private int courseNum;
    private Department department;

    private static int nextId = 1;
    private static final int MAX_COURSE_NUM = 5;

    public Student(String fname, String lname, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.courses = new Course[MAX_COURSE_NUM];
        this.department = department;
    }

    /**
     * Prints the information of a student
     * @return the information of a student
     */

    public String toString() {
        return null;
    }
}
