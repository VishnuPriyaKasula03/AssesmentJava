import java.util.Arrays;

public class Student {
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private int studentAge;
	private String studentGender;
	private double[] studentMarks;

	public Student(int studentId, String studentFirstName, String studentLastName, int studentAge, String studentGender,
			double[] studentMarks) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentMarks = studentMarks;
	}

	/**
	 * @return
	 */
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public double[] getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(double[] studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentAge=" + studentAge + ", studentGender=" + studentGender
				+ ", studentMarks=" + Arrays.toString(studentMarks) + "]";
	}

}