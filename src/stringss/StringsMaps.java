package stringss;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class StringsMaps {

	public static void main(String[] args) {
		String s = "Madhur is good";
		s = s.replaceAll(" ", "");
		char y[] = s.toCharArray();
		int size = y.length;

		Map<Character, Integer> map = new HashMap<>();
		int i = 0;

		for (char c : y) {
			if (map.containsKey(c)) {
				
				map.put(c, map.get(c) + 1);
			} else {

				map.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {

			if (data.getValue() == 1) {
				System.out.print(data.getKey());
				System.out.println(" " + data.getValue());
			}
		}

	}

}
