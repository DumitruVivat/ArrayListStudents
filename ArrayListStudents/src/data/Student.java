package data;

public class Student {
	private String fullname;
    private String specialty;
    private Float  grade;
    
	public Student(String fullname, String specialty, Float grade) {
		this.setFullname(fullname);
		this.setSpecialty(specialty);
		this.setGrade(grade);
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public Float getGrade() {
		return grade;
	}
	public void setGrade(Float grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "[fullname: " + fullname + ", specialty: " + specialty + ", grade: " + grade + "]";
	}

    
     
}
