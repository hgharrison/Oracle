import java.util.List;
import java.util.ArrayList;

public class StudentConn implements StudentEndpoints {

	/**
	 * @param sqlQueryStr
	 * @return
	 */
	public List<Student> query(String sqlQueryStr) {
		return null;
	}

	/*
	 * Add tuple
	 */
	public boolean add(Student student) {
		return false;
	}

	/*
	 * Remove tuple
	 */
	public boolean delete(Student student) {
		return false;
	}

	/*
	 * Get all students
	 */
	public ArrayList getStudents() {
		return null;
	}

	/*
	 * Get student
	 */
	public Student getStudent(int studentID) {
		return null;
	}

	/*
	 * Get students by name
	 */
	public ArrayList searchByName(String lastName) {
		return null;
	}

	/*
	 * Get students by major
	 */
	public ArrayList searchByMajor(String major) {
		return null;
	}

	/*
	 * Get students by classification
	 */
	public ArrayList searchByClassification(String classification) {
		return null;
	}
}
