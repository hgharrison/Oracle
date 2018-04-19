import java.util.ArrayList;

public class StudentMethodEndpoints implements StudentEndpoints {

	private final ArrayList ourList = StudentList.getList();

	/*
	 * Adds a student
	 */
	public boolean add(Student student) {
		Student toAdd = new Student(student.getStudentID(),
				student.getFirstName(), student.getLastName(),
				student.getBaylorEmail(), student.getClassification(),
				student.getMajor(), student.getPhone(), student.getAddress(),
				student.isHasPicture());

		if (!ourList.contains(toAdd)) {
			ourList.add(toAdd);
		}
		return false;
	}

	/*
	 * Deletes a student
	 */
	public boolean delete(Student student) {
		Student toRemove = new Student(student.getStudentID(),
				student.getFirstName(), student.getLastName(),
				student.getBaylorEmail(), student.getClassification(),
				student.getMajor(), student.getPhone(), student.getAddress(),
				student.isHasPicture());

		if (ourList.contains(toRemove)) {
			ourList.remove(toRemove);
		}
		return false;
	}

	/*
	 * Returns a list of students
	 */
	public ArrayList getStudents() {
		return ourList;
	}

	/*
	 * Returns a student
	 */
	public Student getStudent(int studentID) {
		for (int i = 0; i < ourList.size(); i++) {
			Student currStudent = (Student) ourList.get(i);
			if (currStudent.getStudentID() == studentID) {
				return currStudent;
			}
		}
		return null;
	}

	/*
	 * Return students by name
	 */
	public ArrayList searchByName(String lastName) {
		ArrayList ourSearchList = new ArrayList<Student>();

		for (int i = 0; i < ourList.size(); i++) {
			Student currStudent = (Student) ourList.get(i);
			if (currStudent.getLastName() == lastName) {
				ourSearchList.add(currStudent);
			}
		}
		return ourSearchList;
	}

	/*
	 * Return students by major
	 */
	public ArrayList searchByMajor(String major) {
		ArrayList ourSearchList = new ArrayList<Student>();

		for (int i = 0; i < ourList.size(); i++) {
			Student currStudent = (Student) ourList.get(i);
			if (currStudent.getMajor() == major) {
				ourSearchList.add(currStudent);
			}
		}
		return ourSearchList;
	}

	/*
	 * Return students by classification
	 */
	public ArrayList searchByClassification(String classification) {
		ArrayList ourSearchList = new ArrayList<Student>();

		for (int i = 0; i < ourList.size(); i++) {
			Student currStudent = (Student) ourList.get(i);
			if (currStudent.getClassification() == classification) {
				ourSearchList.add(currStudent);
			}
		}
		return ourSearchList;
	}

}