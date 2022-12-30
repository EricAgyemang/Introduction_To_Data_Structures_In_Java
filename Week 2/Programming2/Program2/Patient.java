/**
 * 
 */
package ilstu.edu;

/**
 * @author eagyem2@ilstu.edu
 * 
 * This is the patient class that contains the patient information and
 * it is the super class
 *
 */
public abstract class Patient {

	private int id;
	private String fName;
	private String lName;
	private int age;
	private boolean pcr;

//Constructor for the patients	
	public Patient(int partId, String partFName, String partLName, int partAge) {
		id = partId;
		fName = partFName;
		lName = partLName;
		age = partAge;
	}

	/**
	 * 
	 * Writing the getter Accessors and setter mutators
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the pcr
	 * 
	 */
	public boolean isPcr() {
		return pcr;
	}

	/**
	 * @param pcr the pcr to set
	 */
	public void setPcr(boolean pcr) {
		this.pcr = pcr;
	}

// Abstract method for the treat() method 
	public abstract String treat();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	// Declaring the toString method here
	// The toString method is declared here

	@Override
	public String toString() {

		String result = "Patient [id=" + id + ", Full Name=" + fName + lName + ", age=" + age + ", pcr=" + pcr + "]";

		return result;
	}
}
