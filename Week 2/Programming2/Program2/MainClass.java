/**
 * 
 */
package ilstu.edu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 * @author eagyem2@ilstu.edu
 * 
 * This is a class classed MainClass that has the scanner class that accepts an input from the user based on certain requirement by the
 * hospital. It has the arraylist of patients according to the
 * requirements of the problem.
 * 
 */
public class MainClass {

	/**
	 * @param args
	 * 
	 *This is the main method that controls the flow of the program.
	 */
	public static void main(String[] args) {

		// We use the scanner class to get input from the user.
		Scanner input = new Scanner(System.in);
		ArrayList<Patient> patient = new ArrayList<Patient>();

		// declaring and initializing the user choice of option
		int userOption = 0;

		// Run a while loop with switch case to navigate through the user choice
		while (userOption != 6) {
			System.out.print("\nPlease choose one option from the list (1-6) below: \n");
			System.out.print(
					"1. Admit a patient\n2. Print patient's information\n3. Submit a PCR test result\n4. Do rounds\n5. Discharge patient\n6. Exit\nEnter your choice: ");
			userOption = input.nextInt();
			switch (userOption) {
			case 1:
				System.out.print("\nIs the PCR test result of the patient negative or positive ?"
						+ "\nEnter y for positive and n for negative: ");
				String pcr = input.nextLine();
				if (pcr.equalsIgnoreCase("y")) {

					// Ask for the patient's id
					System.out.print("Enter patient's id: ");
					int id = input.nextInt();
					input.nextLine();

					// Ask for the patient's first name
					System.out.print("Enter patient's first name: ");
					String fName = input.nextLine();

					// Ask for the patient's last name
					System.out.print("Enter patient's last name: ");
					String lName = input.nextLine();

					// Ask for the patient's age
					System.out.print("Enter patient's age: ");
					int age = input.nextInt();
					input.nextLine();

					// Ask for the patient's temperature
					System.out.print("Enter patient's temperature: ");
					double temperature = input.nextDouble();
					input.nextLine();

					Patient pat = new Covid19Patient(id, fName, lName, age, temperature);
					pat.setPcr(true);
					patient.add(pat);

				} else if (pcr.equalsIgnoreCase("n")) {
					// Ask for the patient's id
					System.out.print("Enter patient's id: ");
					int id = input.nextInt();
					input.nextLine();

					// Ask for the patient's first name
					System.out.print("Enter patient's first name: ");
					String fName = input.nextLine();

					// Ask for the patient's last name
					System.out.print("Enter patient's last name: ");
					String lName = input.nextLine();

					// Ask for the patient's age
					System.out.print("Enter patient's age: ");
					int age = input.nextInt();
					input.nextLine();

					// Ask for the patient's temperature
					System.out.print("Enter patient's main symptoms: ");
					String mainSymptom = input.nextLine();

					Patient pat = new RegularPatient(id, fName, lName, age, mainSymptom);
					patient.add(pat);
				} else {
					System.out.println("Invalid input!" + "Enter y for positive and n for negative: ");
				}
				System.out.print("\nPatient is Admitted\n");
				break;
			case 2:
				for (Patient pat : patient) {
					String partInfo = pat.toString();
					System.out.print("\n" + partInfo + "\n\n");
				}
				break;
			case 3:
				System.out.print("Enter patient's id: ");
				int id = input.nextInt();
				input.nextLine();
				System.out.print("Is the PCR test result of the patient negative or positive ?\n "
						+ "Enter y for positive and n for negative: ");
				pcr = input.nextLine();

				// We use a loop to remove a patients from the system if the condition is met.
				// Initializing the removePatientFromSystem variable to be used to remove the
				// patients as required
				Patient removePatientFromSystem = null;
				for (Patient pat : patient) {
					if (pat.getId() == id) {
						if (pcr.equalsIgnoreCase("y")) {
							pat.setPcr(true);
							if (pat instanceof RegularPatient) {
								System.out.print("Enter patient's temperature: ");
								double temp = input.nextDouble();
								input.nextLine();
								Patient newEntry = new Covid19Patient(id, pat.getfName(), pat.getlName(), pat.getAge(),
										temp);
								pat = newEntry;
							}
						} else {
							pat.setPcr(false);
							if (pat instanceof RegularPatient Covid19Patient) {
								removePatientFromSystem = pat;
							}
						}
						break;
					}
				}
				if (removePatientFromSystem != null) {
					System.out.print("Patient " + removePatientFromSystem.getfName() + " is discharged.\n\n");
					patient.remove(removePatientFromSystem);
				}
				break;
			case 4:
				for (Patient pat : patient) {
					if (pat instanceof Covid19Patient) {
						System.out.print("Enter the current temperature: ");
						double temp = input.nextDouble();
						input.nextLine();
						((Covid19Patient) pat).setTemp(temp);
						String treatment = pat.treat();
						System.out
								.print("\nPatient id: " + pat.getId() + "\nRecommended treatment: " + treatment + "\n");
						System.out.println();
					}
				}
				break;
			case 5:
				Iterator<Patient> iterator = patient.iterator();
				// Use a loop to discharge a patients
				while (iterator.hasNext()) {
					Patient pat = iterator.next();
					if (!pat.isPcr()) {
						System.out.print("Patent " + pat.getfName() + "is discharged." + "\n");
						iterator.remove();
					}
				}
				break;
			case 6:
				System.out.print("You are exited from the system!" + "\n");
				break;
			default:
				System.out.print(
						"Option entered not recognized! " + "\nPlease choose one option from the list (1-6) below:");
			}
		}
		input.close();
	}
}
