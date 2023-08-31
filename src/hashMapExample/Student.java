package hashMapExample;

public class Student {
	
	int studentRollNumber;
	String studentName;
	int marks;
	
	public Student(int studentRollNumber,String studentName, int marks) {
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
		this.marks = marks;
		
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getNumber() {
		return studentRollNumber;
	}
	
	public int getMarks() {
		return marks;
	}
}
