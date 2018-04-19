public class Student {
	private final int studentID;
	private final String firstName;
	private final String lastName;
	private final String baylorEmail;
	private final String classification;
	private final String major;
	private final String phone;
	private final String address;
	private final boolean hasPicture;

	/**
	 * Constructor for the student class.
	 */
	public Student() {
		super();
		studentID = 0;
		firstName = "";
		lastName = "";
		baylorEmail = "";
		classification = "";
		major = "";
		phone = "";
		address = "";
		hasPicture = false;
	}

	/**
	 * Constructor with parameters for the student class.
	 * 
	 * @param studentID
	 * @param firstName
	 * @param lastName
	 * @param baylorEmail
	 * @param classification
	 * @param major
	 * @param phone
	 * @param address
	 * @param hasPicture
	 */
	public Student(int studentID, String firstName, String lastName,
			String baylorEmail, String classification, String major,
			String phone, String address, boolean hasPicture) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.baylorEmail = baylorEmail;
		this.classification = classification;
		this.major = major;
		this.phone = phone;
		this.address = address;
		this.hasPicture = hasPicture;
	}

	/**
	 * @return student ID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return email
	 */
	public String getBaylorEmail() {
		return baylorEmail;
	}

	/**
	 * @return class
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @return major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return has picture
	 */
	public boolean isHasPicture() {
		return hasPicture;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", baylorEmail=" + baylorEmail
				+ ", classification=" + classification + ", major=" + major
				+ ", phone=" + phone + ", address=" + address + ", hasPicture="
				+ hasPicture + "]";
	}

}
