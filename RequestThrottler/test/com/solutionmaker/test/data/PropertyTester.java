package com.solutionmaker.test.data;

import com.solutionmaker.throttler.data.ThrottlerConfiguration;

/**
 * This will test the property reader. In future this might not be needed and will be replaced by JUNITS
 * @author Vishal
 *
 */
public class PropertyTester {

	public static void main(String[] args) {
		
		String testPropertyString =  ThrottlerConfiguration.getProperty("test");
		System.out.println("Property Not Exist Test : "+testPropertyString);
		
		testPropertyString =  ThrottlerConfiguration.getProperty("request.throttler.protocol");
		System.out.println("Protocol Property Test : "+testPropertyString);
		
		testPropertyString =  ThrottlerConfiguration.getProperty("request.throttler.numberOfRequestBlades");
		System.out.println("Number of blades string test : "+testPropertyString);
		
		int testPropertyInteger =  ThrottlerConfiguration.getPropertyAsInteger("request.throttler.numberOfRequestBlades",199);
		System.out.println("Default Value test : "+testPropertyInteger);

	}

}
