package core.model.course;

public class Course {
	private int courseID;
	private String name;
	private int numberOfCredit;
	private String description;

	public Course() {
		
	}

	public Course(int courseID, String name, int numberOfCredit, String description) {
		this.courseID = courseID;
		this.name = name;
		this.numberOfCredit = numberOfCredit;
		this.description = description;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", name=" + name + ", numberOfCredit=" + numberOfCredit
				+ ", description=" + description + "]";
	}

}
