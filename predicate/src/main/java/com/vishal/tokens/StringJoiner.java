package com.vishal.tokens;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;

public class StringJoiner {

	public static void main(String[] args) {
			
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Vishal");
		arrayList.add("is a very bad ");
		arrayList.add("human being");
		arrayList.add("Cant # do nothing");
		arrayList.add("all is not # well");
		
		Joiner joiner = Joiner.on("#");
		String join = joiner.join(arrayList);
		
		System.out.println("Output "+join);
		
		
	}

}
