
public class Student implements Comparable<Student> {
	
    int rollNo;
	String name;
	int age;
	 
	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		}

	public int getRollno() {
		return this.rollNo;
	}

	public String getName() {	
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	public int compareTo(Student s) {
		if (this.age != s.getAge()) {
		return s.getAge() - this.age;
	    }
		return this.name.compareTo(s.getName());
	 }
}

