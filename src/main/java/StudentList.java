import java.util.ArrayList;

public class StudentList {
	private final static ArrayList studentList = new ArrayList<Student>();

	// Sample list of test students for manipulation
	public StudentList() {
		this.studentList.add(new Student(1, "Hank", "Harrison",
				"hank_harrison@baylor.edu", "senior", "CSI", "7132137557",
				"123 Main Street", true));
		this.studentList.add(new Student(1, "John", "Smith",
				"john_smith@baylor.edu", "freshman", "BIO", "1234567890",
				"456 South First Street", false));
		this.studentList.add(new Student(1, "Bob", "Jones",
				"bob_jones@baylor.edu", "junior", "BUS", "5467892156",
				"1 South Baylor Street", true));

	}

	public static ArrayList getList() {
		return studentList;
	}

}
