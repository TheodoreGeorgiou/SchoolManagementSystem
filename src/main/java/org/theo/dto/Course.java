package org.theo.dto;

/**
 * Course and their information
 * @author Theodore Georgiou
 */

public class Course {
    private String id;
    private String courseName;
    private double credit;
    private Department department;
    private Teacher teacher;
    private Student[] students;
    private int studentNum;

    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM = 5;

    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextId++);;
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.students = new Student[MAX_STUDENT_NUM];
    }

    /**
     * Prints the information of a course
     * @return the information of a course
     */

    public String toString() {
        return null;
    }
}
