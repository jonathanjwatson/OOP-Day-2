package com.tts;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello!");
//
//		System.out.println(Person.MINIMUM_AGE);
//
//		Person jonathan = new Person("Jonathan");
//
//		jonathan.setAge(40);
//
//		Person random = new Person();
//
//		System.out.println(random.toString());
//
//		jonathan.sayHello("bob");
//
//		random.sayHello("");
//
//		Integer jonathansAgeAtNextBirthday = jonathan.getAgeAtNextBirthday();
//
//		System.out.printf("%s's age at next birthday is %d\n", jonathan.getName(), jonathansAgeAtNextBirthday);
//
//		System.out.println(jonathan.getCalculatdeBirthYear(62));
//
//		Student bob = new Student();
//
//		System.out.println(bob.getAgeAtNextBirthday());
//		
//		bob.enrolledStudent();
//		
//		System.out.println(bob.enrolled);

//	    ArrayList<Student> studentList = new ArrayList<Student>();

//	    Student new_student = new Student();
//	    new_student.setName("Michael");
//	    new_student.setAge(20);
//	    new_student.setGradYear(2020);
//	    studentList.add(new_student);
//	  
//	    Student new_student2 = new Student();
//	    new_student2.setName("Janice");
//	    new_student2.setAge(32);
//	    new_student2.setGradYear(2019);
//	    studentList.add(new_student2);

//	    studentList.add(Student.addStudent("Angela", 43, 1996, false));
//	    studentList.add(Student.addStudent("Daniel", 33, 2002, true));
//	    studentList.add(Student.addStudent("Ronald", 19, 2021, false));
//	  
//	    for (Student s : studentList){
//	      System.out.println("Name: " + s.getName() + "\nAge: " + 
//	      s.getAge() +"\nGraduation Year: " + s.getGradYear() + 
//	      "\nEnrolled? " + s.isEnrolled());
//	    }

		Scanner input = new Scanner(System.in);

		ArrayList<Student> studentList = new ArrayList<Student>();
		String studentName;
		int studentAge;
		int studentGradYear;
		boolean enrollmentStatus;
		String complete = "no";
		// loop keeps getting user input as long as the complete variable equals "no"
		while (complete.equals("no")) {
			System.out.println("Enter a name: ");
			studentName = input.nextLine();
			System.out.println("Enter Age: ");
			studentAge = Integer.parseInt(input.nextLine());
			System.out.println("Year of Graduation: ");
			studentGradYear = Integer.parseInt(input.nextLine());
			System.out.println("Enrolled (enter true or false: ");
			enrollmentStatus = Boolean.parseBoolean(input.nextLine());
			studentList.add(Student.addStudent(studentName, studentAge, studentGradYear, enrollmentStatus));
			System.out.println("List complete? Enter yes or no: ");
			complete = input.nextLine();
		}

		for (Student s : studentList) {
//			System.out.println("Name: " + s.getName() + "\nAge: " + s.getAge() + "\nGraduation Year: " + s.getGradYear()
//					+ "\nEnrolled? " + s.isEnrolled());
			System.out.println(s.toString());
		}
	}
}
