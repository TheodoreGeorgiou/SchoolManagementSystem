package org.theo.dto;

/**
 * Teacher and their information
 * @author Theodore Georgiou
 */

public class Teacher {
    private String id;
    private String fname;
    private String lname;
    private Department department;

    private static int nextId = 1;

    public Teacher(String fname, String lname, Department department) {
        this.id = String.format("T%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
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
