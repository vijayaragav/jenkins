package com.infosys;

public class StudentTester {

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1001);
        student.setName("Jacob");
        student.setQualifyingExamMarks(80);
        student.setResidentialStatus('H');
        student.setYearOfEngg(3);

        System.out.println("Student Name\t\t :\t" + student.getName());
        System.out.println("Student Id\t\t\t :\t" + student.getStudentId());
        System.out.println("Qualifying marks\t :\t" + student.getQualifyingExamMarks());
        System.out.println("Year of Engineering\t :\t" + student.getYearOfEngg());
        if (student.getResidentialStatus() == 'H') {
            System.out.println("Residential status\t :\tHosteller");
        }else if(student.getResidentialStatus() == 'D'){
            System.out.println("Residential status\t :\tDay Scholar");
        }
    }
}
