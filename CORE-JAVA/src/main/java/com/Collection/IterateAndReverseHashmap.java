package com.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateAndReverseHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ram");
		map.put(2, "Shyam");
		map.put(3, "Radha");
		map.put(4, "Seeta");

		Map<String, Integer> reverseMap = reverseHashMap(map);

		System.out.println(reverseMap);
	}

	public static <K, V> Map<V, K> reverseHashMap(Map<K, V> map) {
		Map<V, K> reversedMap = new HashMap<>();

		// Iterating through the original map
		Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<K, V> entry = iterator.next();
			reversedMap.put(entry.getValue(), entry.getKey());
		}

		return reversedMap;
	}

}
