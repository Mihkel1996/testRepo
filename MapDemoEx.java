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

	public static void main(String[] args) {
		//Meetod, mis vahetab etteantud mapi v‰ikseima vıtme v‰‰rtuse parameetriga etteantud v‰‰rtuseks. (Map<Integer, String> )
		//N‰ide: meetodNimi( {2=Indrek, 1=Kalmer, 3=Mati},  ìJ¸riî)-> {2=Indrek, 1=J¸ri, 3=Mati }

		 

		//2. Kıik etteantud mapi sellised v‰‰rtused ‰ra muuta, milles on v‰hem kui 6 (vıi parameetrina ette antud v‰‰rtus) t‰hte ja algab ëAí t‰hega (vıi parameetriga etteantud v‰‰rtusega).

		//N‰ide m‰‰ratud tingimustega: meetodiNimi( {2=Aimar, 1=Kalmer, 3=Mati}) ->  {2=Muudetud, 1=Kalmer, 3=Mati}

		//N‰ide parameetritega: meetodiNimi({2=Aimar, 1=Kalmer, 3=Mati}, 5, ìMî, ìValdurî) -> { 2=Aimar, 1=Kalmer, 3=Valdur}


				MapDemoEx mde = new MapDemoEx();

				HashMap<Integer, String> persons = new HashMap<>();
				persons.put(5, "Indrek");
				persons.put(17, "Mihkel");
				persons.put(3, "Anti");

				System.out.println(lowestKeyValue(persons, "Siim"));
				System.out.println(changeValue(persons, 'A', 6, "Jaan"));

			}

			// ‹l 1
			public static Map<Integer, String> lowestKeyValue(Map<Integer, String> map, String newValie) {
				List<Integer> keys = new ArrayList<>();
				
				for (Integer key : map.keySet()) {
					keys.add(key);
				}
				map.put(Collections.min(keys), newValie);
				return map;
			}

			// ‹l 2
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