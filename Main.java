package org.student_system;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Example usage

        // Create students data
        Student std1 = new Student("Sasi", "kumar", 1201, 95, 3);
        Student std2 = new Student("Ruba", "Shree", 1202, 60, 2);
        Student std3 = new Student("Sakthi","Kumar", 1203, 58,0);
        Student std4 = new Student("Anish", "Banu", 1204, 97, 1);
        Student std5 = new Student("Sakthi", "vel", 1204, 58, 1);


        // Create course
        Course sub = new Course("Junior Java Fillstack Developer", "Prof. Annamalai", 2024);

        // Enroll individual students
        sub.enroll(std1);
        sub.enroll(std2);

        // Print student count and best grade
        System.out.println("list Number Of Students in JSD class BEFORE Entroll :");
        System.out.println("Number of students: " + sub.countStudents());
        System.out.println("Best grade in the course: " + sub.bestGrade() );

        // Enroll a list of students
        List<Student> studentList = Arrays.asList(std3,std4,std5);
        sub.enroll(studentList);
        
        System.out.println();
        // Print updated student count and best grade
        System.out.println("list Number Of Students in JSD class AFTER Entroll :");
        System.out.println("Number of students after enrolling a list: " + sub.countStudents());
        System.out.println("Best grade in the course after enrolling a list: " + sub.bestGrade());
    }
}
