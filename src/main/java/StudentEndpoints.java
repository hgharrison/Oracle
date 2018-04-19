import java.util.ArrayList;

public interface StudentEndpoints {

	// Booleans indicating operation success
	public boolean add(Student student);

	public boolean delete(Student student);

	// Returns ArrayLists of Students or Student object
	public ArrayList getStudents();

	public Student getStudent(int studentID);

	public ArrayList searchByName(String lastName);

	public ArrayList searchByMajor(String major);

	public ArrayList searchByClassification(String classification);
}
