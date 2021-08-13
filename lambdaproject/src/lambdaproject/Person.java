package lambdaproject;

import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
		name = nameArg;
		birthday = birthdayArg;
		gender = genderArg;
		emailAddress = emailArg;
	}

	public int getAge() {
		return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
	}

	public void printPerson() {
		System.out.println(name + ", " + this.getAge());
	}

	public Sex getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public static int compareByAge(Person a, Person b) {
		return a.birthday.compareTo(b.birthday);
	}

	public static List<Person> createRoster() {

		List<Person> roster = new ArrayList<>();
		roster.add(new Person("Anu", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.FEMALE, "anu@gmail.com"));
		roster.add(new Person("Baghat", IsoChronology.INSTANCE.date(1999, 7, 15), Person.Sex.MALE, "Baghat@gmail.com"));
		roster.add(
				new Person("Charan", IsoChronology.INSTANCE.date(1991, 8, 13), Person.Sex.MALE, "charan@gmail.com"));
		roster.add(new Person("Dhanu", IsoChronology.INSTANCE.date(2000, 9, 12), Person.Sex.MALE, "dhanu@gmail.com"));

		return roster;
	}

}