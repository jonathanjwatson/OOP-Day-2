package com.tts;

public class Student extends Person {
	private Integer gradYear;
	private Boolean enrolled = false;

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public boolean isEnrolled() {
		return enrolled;
	}

	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}

	void enrolledStudent() {
		enrolled = true;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nGraduation Year: " + this.getGradYear()
				+ "\nEnrolled? " + this.isEnrolled();
	}

	static Student addStudent(String name, Integer age, Integer gradYear, Boolean enrolled) {
		Student newStudent = new Student();
		newStudent.setName(name);
		newStudent.setAge(age);
		;
		newStudent.setGradYear(gradYear);
		newStudent.setEnrolled(true);
		return newStudent;
	}

}
