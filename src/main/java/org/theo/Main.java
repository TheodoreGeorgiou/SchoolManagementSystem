package org.theo;

import org.theo.dto.*;

/**
 * Driver class (all callings)
 * @author Theodore Georgiou
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem("Vanier College");

        System.out.println("Additions:");
        school.addDepartment("Computer Science");
        school.addCourse("Intro to Programming", 5, "D001");
        school.addTeacher("Yi", "Wang", "D001");
        school.addStudent("Theodore", "Georgiou", "D001");

        System.out.println("\nTeacher modifications:");
        school.modifyCourseTeacher("T001", "C001");

        System.out.println("\nAll departments:");
        school.printDepartments();

        System.out.println("\nAll courses:");
        school.printCourses();

        System.out.println("\nAll teachers:");
        school.printTeachers();

        System.out.println("\nAll students:");
        school.printStudents();
    }
}
