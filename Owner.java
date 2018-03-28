package Car;

import java.time.LocalDate;
import java.time.Period;

public class Owner {

    private String firstName;
    private String lastName;
    private IdentificationNumber idCode;
    private LocalDate releaseDate;
    private LocalDate expireDate;
    private Status licenceStatus;

    public Owner() {
    }

    public Owner(String firstName, String lastName, IdentificationNumber idCode, LocalDate releaseDate, LocalDate expireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idCode = idCode;
        this.releaseDate = releaseDate;
        this.expireDate = expireDate;
        if (expireDate.compareTo(LocalDate.now()) > 0) {
            this.licenceStatus = Status.ACTIVE;
        } else {
            this.licenceStatus = Status.EXPIRED;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public IdentificationNumber getIdCode() {
        return idCode;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public Status getLicenceStatus() {
        return licenceStatus;
    }

    public void surrenderLicence() {
        if (this.getLicenceStatus().equals(Status.ACTIVE)) {
            this.licenceStatus = Status.STOPED;
            this.expireDate = LocalDate.now();
        }
    }

    public String getSeniority() {
        LocalDate date;
        if (expireDate.equals(null) && expireDate.isAfter(LocalDate.now())) {
            date = LocalDate.now();
        } else {
            date = expireDate;
        }

        Period period = Period.between(releaseDate, date);

        return period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days.";
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idCode=" + idCode +
                ", releaseDate=" + releaseDate +
                ", expireDate=" + expireDate +
                ", licenceStatus=" + licenceStatus +
                '}';
    }

    enum Status {
        ACTIVE, STOPED, EXPIRED
    }
}
