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
        int numOfFull = 0;

        for (Department department : departments) {
            if (department != null) {
                numOfFull++;
            }
        }

        if (numOfFull == MAX_DEPARTMENT_NUM) {
            System.out.println("Max amount of departments reached, adding a department has failed.");
        } else {
            for (int i = 0; i < departments.length; i++) {
                if (departments[i] == null) {
                    departments[i] = new Department(departmentName);
                    System.out.println(departments[i] + " added successfully.");
                    break;
                }
            }
        }
    }

    /**
     * Finds a department based on its id
     * @param departmentId the id of the department that needs to be found
     * @return the found department
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && department.getId().equals(departmentId)) {
                return department;
            }
        }

        return null;
    }

    /**
     * Prints all departments in a school that are not null
     */
    public void printDepartments() {
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * Adds a new course
     * @param courseName name of the course
     * @param credit credit of the course
     * @param departmentId name of the department
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        int numOfFull = 0;

        for (Course course : courses) {
            if (course != null) {
                numOfFull++;
            }
        }

        if (numOfFull == MAX_COURSE_NUM) {
            System.out.println("Max amount of courses reached, adding a course has failed.");
        } else {
            for (int i = 0; i < courses.length; i++) {
                if (courses[i] == null) {
                    courses[i] = new Course(courseName, credit, findDepartment(departmentId));
                    System.out.println(courses[i] + " added successfully.");
                    break;
                }
            }
        }
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
     * Prints all courses in a school that are not null
     */
    public void printCourses() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    /**
     * Adds a new teacher
     * @param fname first name of the teacher
     * @param lname last name of the teacher
     * @param departmentId id of the department
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        int numOfFull = 0;

        for (Teacher teacher : teachers) {
            if (teacher != null) {
                numOfFull++;
            }
        }

        if (numOfFull == MAX_TEACHER_NUM) {
            System.out.println("Max amount of teachers reached, adding a teacher has failed.");
        } else {
            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] == null) {
                    teachers[i] = new Teacher(fname, lname, findDepartment(departmentId));
                    System.out.println(teachers[i] + " added successfully.");
                    break;
                }
            }
        }
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
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * Adds a new student
     * @param fname first name of the student
     * @param lname last name of the student
     * @param departmentId id of the department
     */
    public void addStudent(String fname, String lname, String departmentId) {
        int numOfFull = 0;

        for (Student student : students) {
            if (student != null) {
                numOfFull++;
            }
        }

        if (numOfFull == MAX_STUDENT_NUM) {
            System.out.println("Max amount of students reached, adding a student has failed.");
        } else {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = new Student(fname, lname, findDepartment(departmentId));
                    System.out.println(students[i] + " added successfully.");
                    break;
                }
            }
        }
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
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
