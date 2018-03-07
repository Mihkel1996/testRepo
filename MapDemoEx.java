package mapDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemoEx {

	private static MapDemoEx mde;

	public static void main(String[] args) {
		//Meetod, mis vahetab etteantud mapi väikseima võtme väärtuse parameetriga etteantud väärtuseks. (Map<Integer, String> )
		//Näide: meetodNimi( {2=Indrek, 1=Kalmer, 3=Mati},  “Jüri”)-> {2=Indrek, 1=Jüri, 3=Mati }

		 

		//2. Kõik etteantud mapi sellised väärtused ära muuta, milles on vähem kui 6 (või parameetrina ette antud väärtus) tähte ja algab ‘A’ tähega (või parameetriga etteantud väärtusega).

		//Näide määratud tingimustega: meetodiNimi( {2=Aimar, 1=Kalmer, 3=Mati}) ->  {2=Muudetud, 1=Kalmer, 3=Mati}

		//Näide parameetritega: meetodiNimi({2=Aimar, 1=Kalmer, 3=Mati}, 5, “M”, “Valdur”) -> { 2=Aimar, 1=Kalmer, 3=Valdur}


				mde = new MapDemoEx();

				HashMap<Integer, String> persons = new HashMap<>();
				persons.put(5, "Indrek");
				persons.put(17, "Mihkel");
				persons.put(3, "Anti");

				System.out.println(lowestKeyValue(persons, "Siim"));
				System.out.println(changeValue(persons, 'S', '4', "Karl"));

			}

			// Ül 1
			public static Map<Integer, String> lowestKeyValue(Map<Integer, String> map, String newValie) {
				List<Integer> keys = new ArrayList<>();
				
				for (Integer key : map.keySet()) {
					keys.add(key);
				}
				map.put(Collections.min(keys), newValie);
				return map;
			}

			// Ül 2
			public static Map<Integer, String> changeValue(HashMap<Integer, String> map, Character letter, int length,
					String newValue) {
				

				for (Map.Entry<Integer, String> entry : map.entrySet()) {
					if (entry.getValue().length() < length && entry.getValue().startsWith(letter.toString())) {
						map.put(entry.getKey(), newValue);
					}
				}
				

				return map;
			}
		}
