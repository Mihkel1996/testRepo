package student;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Student {
	//private fields
	private String nime;
	private LocalDate dateOfBirth;
	private List<Subject> subjects;
	private Type type;
	private IdentifyCode idCode;
	
	// constructor
	public Student(String nime, LocalDate dateOfBirth, Type type) {
		this.nime = nime;
		this.dateOfBirth = dateOfBirth;
		this.subjects = new ArrayList<Subject>();
		this.type = type;
	}
	
	public Student(String nime, LocalDate dateOfBirth, Type type, String idCode, Country idCountry) {
		this.nime = nime;
		this.dateOfBirth = dateOfBirth;
		this.subjects = new ArrayList<Subject>();
		this.type = type;
		this.idCode = new IdentifyCode(idCode, idCountry);
	}


	/**
	 * @return the nime
	 */
	public String getNime() {
		return nime;
	}

	/**
	 * @param nime the nime to set
	 */
	public void setNime(String nime) {
		this.nime = nime;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return the subjects
	 */
	public List<Subject> getSubjects() {
		return subjects;
	}

	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	public String getAgeAsString() {
		LocalDate today = LocalDate.now();
		Period p = Period.between(dateOfBirth, today);
		long p2 = ChronoUnit.DAYS.between(dateOfBirth, today);

	return this.nime + " is " + p.getYears() + " years, " + p.getMonths() +
						" months, and " + p.getDays() +
						" days old. (" + p2 + "days total)";
	}
	@Override
	public String toString() {
		return "Student [nime=" + nime + ", dateOfBirth=" + dateOfBirth + ", subjects=" + subjects + ", type=" + type
				+ ", idCode=" + idCode + "]";
	}
	
	
	
	}
	
