package org.theo.dto;

/**
 * School Management System which has multiple functionalities
 * @author Theodore Georgiou
 */

public class SchoolManagementSystem {
    private String name;
    private Department[] departments;
    private Course[] courses;
    private Teacher[] teachers;
    private Student[] students;

    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_COURSE_NUM = 30;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_STUDENT_NUM = 200;

    public SchoolManagementSystem(String name) {
        this.name = name;
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
    }

    /**
     * Adds a new department
     * @param departmentName the name of the department
     */

    public void addDepartment(String departmentName) {

    }

    /**
     * Finds a department based on its id
     * @param departmentId the id of the department that needs to be found
     * @return the found department
     */

    public Department findDepartment(String departmentId) {
        return null;
    }

    /**
     * Prints all departments in a school that are not null
     */

    public void printDepartments() {

    }

    /**
     * Adds a new course
     * @param courseName name of the course
     * @param credit credit of the course
     * @param departmentId name of the department
     */

    public void addCourse(String courseName, double credit, String departmentId) {

    }

    /**
     * Finds a course based on its id
     * @param courseId the id of the course that needs to be found
     * @return the found course
     */

    public Course findCourse(String courseId) {
        return null;
    }

    /**
     * Registers a student to a course
     * @param studentId id of the student
     * @param courseId id of the course
     */

    public void registerCourse(String studentId, String courseId) {

    }

    /**
     * Adds a new teacher
     * @param fname first name of the teacher
     * @param lname last name of the teacher
     * @param departmentId id of the department
     */

    public void addTeacher(String fname, String lname, String departmentId) {

    }

    /**
     * Finds a teacher based on their id
     * @param teacherId the id of the teacher that needs to be found
     * @return the found teacher
     */

    public Teacher findTeacher(String teacherId) {
        return null;
    }

    /**
     * Assigns a teacher to a course
     * @param teacherId id of the teacher
     * @param courseId id of the course
     */

    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     * Prints all teachers in a school that are not null
     */

    public void printTeachers() {

    }

    /**
     * Adds a new student
     * @param fname first name of the student
     * @param lname last name of the student
     * @param departmentId id of the department
     */

    public void addStudent(String fname, String lname, String departmentId) {

    }

    /**
     * Finds a student based on their id
     * @param studentId the id of the student that needs to be found
     * @return the found student
     */

    public Student findStudent(String studentId) {
        return null;
    }

    /**
     * Prints all students in a school that are not null
     */

    public void printStudents() {

    }
}
