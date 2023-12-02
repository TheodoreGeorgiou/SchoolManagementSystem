package org.theo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Department and their information
 * @author Theodore Georgiou
 */
@Getter
@Setter
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
    @Override
    public String toString() {
        return "Department{" + "id='" + id + "'" + ", departmentName='" + departmentName + "'" + '}';
    }
}
