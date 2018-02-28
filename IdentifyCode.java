package student;

public class IdentifyCode {
	private String code;
	private Country country;
	public IdentifyCode(String code, Country country) {
		super();
		this.code = code;
		this.country = country;
	}
	@Override
	public String toString() {
		return "IdentifyCode [code=" + code + ", country=" + country + "]";
	}
	
	
}
