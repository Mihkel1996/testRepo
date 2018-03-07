
import java.util.List;
import LocalDateTime;
import java.time.LocalDateTime;
import java.util.Date;

public class Mudelid {

	private String nimetus;
	private Tootmisalguskuupäev alguskuupäev;
	private Tootmislõppkuupäev lõppkuupäev;
	private String mudeliliik;

	public Mudelid(String nimetus, Tootmisalguskuupäev alguskuupäev, Tootmislõppkuupäev lõppkuupäev,
			Mudeliliik mudeliliik) {
		this.nimetus = nimetus;
		this.alguskuupäev = alguskuupäev;
		this.lõppkuupäev = lõppkuupäev;
		this.mudeliliik = mudeliliik;
	}

}
