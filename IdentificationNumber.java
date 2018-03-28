package Car;

public class IdentificationNumber {

    private Long code;
    private CountryIndex countryIndex;

    public IdentificationNumber(Long code, CountryIndex countryIndex) {
        this.code = code;
        this.countryIndex = countryIndex;
    }

    public Long getCode() {
        return code;
    }

    public CountryIndex getCountryIndex() {
        return countryIndex;
    }

    @Override
    public String toString() {
        return "IdentificationNumber{" +
                "code=" + code +
                ", countryIndex=" + countryIndex +
                '}';
    }

    public enum CountryIndex {
        ESTONIA, LATVIA, SWEDEN, RUSSIA, BELARUS, NORWAY, GERMANY, DENMARK, FRANCE, SPAIN, FINLAND, GREECE, POLAND
    }
}
