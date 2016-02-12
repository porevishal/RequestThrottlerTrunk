package com.vishal.bloch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class EnumMapExample {

	private static enum PLANET {
		MERCURY, EARTH, VENUS
	};

	public static void main(String[] args) {

		Map<PLANET, List<String>> myEnumMap = new EnumMap<PLANET, List<String>>(
				PLANET.class);

		String[] earthStrings = new String[] { "e1", "e2" };
		String[] mercuryStrings = new String[] { "m1", "m2" };
		String[] venusStrings = new String[] { "v1", "v2" };

		List<String> earthList = new ArrayList<String>(
				Arrays.asList(earthStrings));
		List<String> mercuryList = new ArrayList<String>(
				Arrays.asList(mercuryStrings));
		List<String> venusList = new ArrayList<String>(
				Arrays.asList(venusStrings));
		
		
		myEnumMap.put(PLANET.EARTH, earthList);
		myEnumMap.put(PLANET.MERCURY, mercuryList);
		myEnumMap.put(PLANET.VENUS, venusList);
		
		System.out.println("Only EARTH will be printed "+myEnumMap.get(PLANET.EARTH));

	}

}
