import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class smallproject3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int rollNo;
		String name;
	    int age;
	    System.out.println("give the number of students");
	    int n = scan.nextInt();
	    ArrayList<Student> s=new ArrayList<Student>();
		
		for(int i=0; i<n; i++) {
		System.out.println("give the student registration number");
		System.out.println("give the name of the student");
		System.out.println("give the age of the student");
		s.add(new Student(rollNo = scan.nextInt(),name = scan.next(),age = scan.nextInt()));
		    }
		 
		Collections.sort(s);    
		for(Student st:s){    
		System.out.println("RollNo:" +st.rollNo + ", Name:" +st.name+", Age:" +st.age);    
		} 
     }
}