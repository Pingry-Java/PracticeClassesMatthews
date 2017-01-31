public class Runner{
	public static void main(String[] args){
		Fraction a = new Fraction(1,4);
		Fraction b = new Fraction(1,3);
		System.out.println(a);
		System.out.println(b);
		Fraction c = a.add(b);
		System.out.println(c);
		
		Student stu1 = new Student(12);
		System.out.println(stu1.getAge());
		stu1.haveBirthday();
		System.out.println(stu1.getAge());
	}
}