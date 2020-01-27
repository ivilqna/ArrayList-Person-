package fmi.informatics.tests;

import fmi.informatics.extending.Student;

public class unit {

	public static void testStudent(Student student) {

		String Uniexpected = "SU";

		String Uniresult = student.getUniversity();

		if (assertString(Uniresult, Uniexpected)) {

			System.out.println("The student is studying at PU");

		} else {

			System.out.println(

					"The student is not studying at " + Uniexpected

							+ ", but is studying at " + Uniresult);

		}

	}

	public static boolean assertString(String result, String expectedResult) {

		return result.equals(expectedResult);

	}

}
