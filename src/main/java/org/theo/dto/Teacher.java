package org.theo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Teacher and their information
 * @author Theodore Georgiou
 */
@Getter
@Setter
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
     * Prints the information of a teacher
     * @return the information of a teacher
     */
    @Override
    public String toString() {
        String departmentName = null;

        if (department != null) {
            departmentName = department.getDepartmentName();
        }

        return "Teacher{" + "id='" + id + "'" + ", fname='" + fname + "'" + ", lname='" + lname + "'" +
                ", department='" + departmentName + "'" + '}';
    }
}
