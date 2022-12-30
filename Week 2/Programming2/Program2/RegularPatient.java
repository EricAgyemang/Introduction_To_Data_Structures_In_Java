/**
 * 
 */
package ilstu.edu;

/**
 * @author eagyem2@ilstu.edu
 * 
 *This is a class of RegularPatient that extends the Patient class as the super class
 */
public class RegularPatient extends Patient {

	// Declare the mainSymptom variable of the subclass
	private String mainSymptom;

	/**
	 * @param partId
	 * @param partFName
	 * @param partLName
	 * @param partAge
	 */
	public RegularPatient(int partId, String partFName, String partLName, int partAge, String mainSymptom) {
		super(partId, partFName, partLName, partAge);
		this.mainSymptom = mainSymptom;
	}

	// The treat() method in the PregularPatient class is declared
	@Override
	public String treat() {

		if (mainSymptom.equalsIgnoreCase("coughing") || mainSymptom.equalsIgnoreCase("runny nose")
				|| mainSymptom.equalsIgnoreCase("stuffy nose")) {
			return "Amoxicillin";
		} else if (mainSymptom.equalsIgnoreCase("hypertension")) {
			return "ACE inhabitors";
		} else {
			return "IV fluids";
		}
	}

	@Override
	public String toString() {
		// Writing an instance of the local variable StringBuilder
		StringBuilder string2 = new StringBuilder();
		string2.append("id: ").append(super.getId()).append("\n").append("Full Name: ").append(super.getfName())
				.append(" ").append(super.getlName()).append("\n").append("Age: ").append(super.getAge()).append("\n")
				.append("Main Symptom: ").append(mainSymptom).append("\n").append("PCR test result: ")
				.append(super.isPcr() ? "Positive" : "Negative").append("\n").append("Treatment: ").append(treat())
				.append("\n");

		return string2.toString();
		// return "RegularPatient [mainSymptom=" + mainSymptom + ", toString()=" +
		// super.toString() + "]";
	}
}
