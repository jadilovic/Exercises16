package Vjezbe;

public class Student {

	String name;
	String lastName;
	int score;

	public Student(String name, String lastName, int score) {

		this.name = name;
		this.lastName = lastName;
		this.score = score;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name + " " + lastName + " " + score;
	}

	
}
