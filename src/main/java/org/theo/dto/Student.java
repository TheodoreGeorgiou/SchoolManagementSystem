package org.theo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Student and their information
 * @author Theodore Georgiou
 */
@Getter
@Setter
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
    @Override
    public String toString() {
        String courseStr = "[";
        String departmentName = null;

        for (Course course : courses) {
            if (course != null) {
                courseStr += course.getCourseName() + ", ";
            }
        }
        courseStr += "]";

        if (department != null) {
            departmentName = department.getDepartmentName();
        }

        return "Student{" + "id='" + id + "'" + ", fname='" + fname + "'" + ", lname='" + lname + "'" +
                ", department='" + departmentName + "'" + ", courses=" + courseStr +
                ", courseNum='" + courseNum + "'" + '}';
    }
}
