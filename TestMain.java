package fmi.informatics.tests;

import fmi.informatics.extending.Student;

public class TestMain {

	public static void main(String[] args) {

		Student student = new Student("Nick", 425, "PU", "BIT", 6455);

		unit.testStudent(student);

	}
}
