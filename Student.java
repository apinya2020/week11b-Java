package week11b;
public class Student {
	//state,instance variable //global variable
	int id;
	String name,grade,subject;
	//default Constructor
	public Student() {
		super();
		System.out.println("Default Construtor");
	}
	//Parameter Constructor
	Student(int i, String n){
		 id = i;
		 name=n;
	}
	//Parameter Constructor
	Student(int i, String n, String g){
		 id = i;
		 name=n;
		 grade = g;
	}
	//Creating four arg constructor or Overloading Constructor
	Student(int i, String n, String g, String s){
		id = i;
		name=n;
		grade=g;
		subject=s;
	}
	//constructor to initialize another object
	Student(Student s){
		id = s.id;
		name = s.name;
		grade=s.grade;
		subject=s.subject;
	}
	
	//Student(){}
	
	void display() {
		System.out.println(id + " " + name + " " + grade + " " + subject);
	}
	public static void main(String[]args) {
		Student std1 = new Student(3901001,"Karen");
		Student std2 = new Student(3901002,"Jame","B");
		Student std3 = new Student(3901003,"Peter,","C,","C-programming");
		Student std4 = new Student(std1);
		std1.display();
		std2.display();
		std3.display();
		std4.display();
	}
}
