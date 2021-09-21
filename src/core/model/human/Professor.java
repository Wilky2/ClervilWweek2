package core.model.human;

public class Professor extends Human {
	private int professorID;

	public Professor(String lname, String fname,int professorID) {
		super(lname, fname);
		
		this.professorID =professorID;
	}

	public Professor() {
		
	}

	public int getProfessorID() {
		return professorID;
	}

	public void setProfessorID(int professorID) {
		this.professorID = professorID;
	}

	@Override
	public String toString() {
		return "Professor [professorID=" + professorID + ", toString()=" + super.toString() + "]";
	}
}
