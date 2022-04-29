package calculateAge;

import java.time.Period;
import java.time.LocalDate;

public class CalculateAge {

	// Calculate age (years) between date of birth and current date
	public static int ageInYears(LocalDate birthDate, LocalDate currentDate) {
		if ((birthDate != null) && (currentDate != null)) {
			return Period.between(birthDate, currentDate).getYears();
		} else {
			return 0;
		}
	}
}
