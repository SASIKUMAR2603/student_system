package org.student_system;
import java.util.ArrayList;
public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructor1 in Student class
    public Student(String startName, String endName, int entrollment, int mark, int year) {
        this.firstName = startName;
        this.lastName = endName;
        this.registration = entrollment;
        this.grade = mark;
        this.year = year;
    }
 // Constructor2 in Student class
    public Student(String startName, String endName, int entrollment) {
        this(startName, endName, entrollment, 0, 1);
    }
 // Constructor3 in Student class
    public Student(String startName, String endName) {
        this(startName, endName, 0, 0, 1);
    }

    // Methods
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
       boolean check = grade >= 60;
    	return check;
    }

    public int changeYearIfApproved() {
    	int updateYear=0;
        if (isApproved()) {
             updateYear = year+1 ;
            System.out.println("Congratulations!");
        }
        return updateYear;
    }
}

