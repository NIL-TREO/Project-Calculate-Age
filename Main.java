/******************************************************************************
Enter first and last name of a person and his/her date of birth. The programm will calculate the person's actual age today.
*******************************************************************************/
package calculateAge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Scanner input: first name, last name and birthday
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter first name");
		String firstName = s.next();
		System.out.println("Please enter last name");
		String lastName = s.next();
		System.out.println("Please enter DAY of birth: [dd]");
		int dayOfBirth = s.nextInt();
		System.out.println("Please enter MONTH of birth: [mm]");
		int monthOfBirth = s.nextInt();
		System.out.println("Please enter YEAR of birth: [yyyy]");
		int yearOfBirth = s.nextInt();
		LocalDate birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

		// Console output:
		System.out.println("\nThe person's name is " + firstName + " " + lastName + ", born on " + dayOfBirth + "."
				+ monthOfBirth + "." + yearOfBirth + "\n");

		// Console output of current date
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("Current date: " + formatter.format(now));

		// Console output of actual age
		System.out.println("\nThe person is " + CalculateAge.ageInYears(birthDate, now) + " years old.");

	}
}
