class UndergraduateStudent extends Student
{
	int credit;
	void print()
	{
		System.out.println("UndergraduateStudent");
	}	
}
class GraduateStudent extends Student
{
	int credit;
	boolean status;
	void print()
	{
		System.out.println("GraduateStudent");
	}
}
class Freshman extends Student
{
	void print()
	{
		System.out.println("FreshmanStudent");
	}
}
class Sophomore extends Student
{
	void print()
	{
		System.out.println("SophomoreStudent");
	}
}
class Junior extends Student
{
	void print()
	{
		System.out.println("JuniorStudent");
	}
}
class Senior extends Student
{
	void Senior(String n,int sid, int a, String rn)
	{
		name=n;
		id=sid;
		age=a;
		regNo=rn;
	}
	void print()
	{
		System.out.println("SeniorStudent");
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(regNo);
	}
}
class DoctoralStudent extends Student
{
	char specialization;
	void print()
	{
		System.out.println("DoctoralStudent");
	}
}
class MastersStudent extends Student
{
	void print()
	{
		System.out.println("MastersStudent");
	}
}

public abstract class Student {
	String name;
	int id;
	int age;
	String regNo;
	abstract void print();
	public static void main(String[] args)
	{
		Student u =new UndergraduateStudent();
		Student g =new GraduateStudent();
		Student f =new Freshman();
		Student s =new Sophomore();
		Student j =new Junior();
		Student sr =new Senior("Khadija",9,20,"L1F20BSSE0005");
		Student d =new DoctoralStudent();
		Student m =new MastersStudent();
		u.print();
		g.print();
		f.print();
		s.print();
		j.print();
		sr.print();
		d.print();
		m.print();
		
	}
}