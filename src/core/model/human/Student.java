package core.model.human;

public class Student extends Human {
	private int studentID;

	public Student(String lname, String fname,int studentID) {
		super(lname, fname);
		
		this.studentID=studentID;
	}

	public Student() {
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", toString()=" + super.toString() + "]";
	}

}
