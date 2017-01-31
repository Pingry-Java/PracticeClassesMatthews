public class Student{
	private String name;
	private int age;
	private static int oldestStudent;
	
	public Student(){
		name = "John Doe";
		age = 6;
		if(this.age>oldestStudent){
			oldestStudent=age;
		}
	}
	
	public Student(String newName){
		this.name = newName;
		this.age = 6;
		if(this.age>oldestStudent){
			oldestStudent=age;
		}
	}
	
	public Student(int newAge){
		this.age = newAge;
		this.name = "John Doe";
		if(this.age>oldestStudent){
			oldestStudent=age;
		}
	}
	
	public Student(String newName, int newAge){
		this.name = newName;
		this.age = newAge;
		if(this.age>oldestStudent){
			oldestStudent=age;
		}
	}
	
	public String toString(){
		return name;
	}
	
	public void haveBirthday(){
		this.age++;
		if(this.age>oldestStudent){
			oldestStudent=age;
		}
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public static int getOldestStudent(){
		return oldestStudent;
	}
	
	
}