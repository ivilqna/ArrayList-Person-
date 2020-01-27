package fmi.informatics.extending;

import java.util.ArrayList;

import fmi.informatics.composition.RichStudent2;

public class TestClass {

	public static void people(ArrayList<Person> people) {

		people.add(new Student("Nick", 425, "PU", "BIT", 6455));

		people.add(new Student("Martin", 745, "SU", "INF", 9632));

		people.add(new Professor("Professor", "Sam", true, 45, 485, 65));

		people.add(new Professor("Professor", "Zoe", true, 40, 585, 20));

		people.add(new RichStudent2("Petio", 586, "PU", "BIT", 1452));

		people.add(new RichStudent2("Vasil", 6266, "PU", "INF", 5345));

	}

	public static void showStats(ArrayList<Person> people) {

		int stuCount = 0, profCount = 0, richCount = 0;

		for (int i = 0; i < people.size(); i++) {

		}

		System.out.println("The number of students are: " + stuCount + "\nThe number of professors are: "

				+ profCount + "\nThe number of rich students are: " + richCount);

		System.out.println("\nThe total people here are: " + (stuCount + profCount + richCount) + "\n");

	}
	

	public static void test() {

		Student student = new Student("Nick", 425, "PU", "BIT", 6455) {

			@Override

			public void study() {

				System.out.println("\nThe student is studying every day.");

			}

			@Override

			public void think() {

				System.out.println("\nThe student is thinking for party.");

			}

			@Override

			public void act() {

				System.out.println("\nThe student is acting now.");

			}

		};

		student.study();

		student.think();

		student.act();

	}

	public static void ClassnewInstance()

			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class<?> classForName = Class.forName(Student.class.getName());

		System.out.println("\nThe student's class for name is: " + classForName);

		Student studentnewInstance = (Student) classForName.newInstance();

		studentnewInstance.takeExam();

	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		ArrayList<Person> people = new ArrayList<>();
		
		people(people);
		
		showStats(people);

		test();

		ClassnewInstance();

	}

}
