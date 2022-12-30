/**
 * 
 */
package ilstu.edu;

/**
 * @author eagyem2@ilstu.edu
 * 
 * This is a class of CovidPatients that extends the Patients class and it gives the details of the methods and constructors of the patient
 *
 */
public class Covid19Patient extends Patient {

	// We declare the patient temperature variable
	private double temperature;

	/**
	 * @param partId
	 * @param partFName
	 * @param partLName
	 * @param partAge
	 * 
	 * The constructor is given here as Covid19Patient
	 */
	public Covid19Patient(int partId, String partFName, String partLName, int partAge, double temperature) {
		super(partId, partFName, partLName, partAge);
		this.temperature = temperature;
	}

	// The treat method is overridden from the super class patient
	@Override
	public String treat() {

		if (temperature > 38.5 && super.getAge() > 67) {
			return "Ramdesivir";
		} else if (temperature > 41) {
			return "Dexamethasone";
		} else {
			return "fluids and Tylenol";
		}
	}

	/**
	 * The temperature accessor is declared her as getTemp()
	 * 
	 * @return temperature
	 * 
	 */
	public double getTemp() {
		return temperature;
	}

	/**
	 * @param temperature The temperature mutator is declared here
	 */
	public void setTemp(double temperature) {
		this.temperature = temperature;
	}

	// We override the toString method from the super class
	@Override
	public String toString() {

		// Writing an instance of the local variable StringBuilder
		StringBuilder string1 = new StringBuilder();
		string1.append("id: ").append(super.getId()).append("\n").append("Full Name: ").append(super.getfName())
				.append(" ").append(super.getlName()).append("\n").append("Age: ").append(super.getAge()).append("\n")
				.append("Temperatur: ").append(getTemp()).append("\n").append("PCR test result: ")
				.append(super.isPcr() ? "Positive" : "Negative").append("\n").append("Treatment: ").append(treat())
				.append("\n");

		return string1.toString();
	}
}
