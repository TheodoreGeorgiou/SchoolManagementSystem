package org.theo.dto;

/**
 * Department and their information
 * @author Theodore Georgiou
 */

public class Department {
    private String id;
    private String departmentName;

    private static int nextId = 1;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    /**
     * Prints the information of a department
     * @return the information of a department
     */

    public String toString() {
        return null;
    }
}
