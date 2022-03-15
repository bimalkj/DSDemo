package mypack;

public class Stud {
	int rollno;
	String name;
	
	public Stud(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	
	public String toString() {
		return name+"("+rollno+")";
	}

}
