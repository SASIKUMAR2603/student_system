package org.student_system;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName, String mentorName, int year) {
        this.courseName = courseName;
        this.professorName = mentorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    // Methods
    public void enroll(Student student) {
       enrolledStudents.add(student);
    }

    public void enroll(List<Student> students) {
        enrolledStudents.addAll(students);
    } 

    public void unEnroll(Student student) {
        enrolledStudents.removeIf(s -> s.registration == student.registration);
    }

    public int countStudents() {
    	
       int count = enrolledStudents.size();
       return count;
    }

    public int bestGrade() {
        int maxGrade = 0;
        for (Student student : enrolledStudents) {
            maxGrade = Math.max(maxGrade, student.grade);
        }
        return maxGrade;
    }
    
}
