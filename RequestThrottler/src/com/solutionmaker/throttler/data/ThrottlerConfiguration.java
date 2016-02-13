package com.solutionmaker.throttler.data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class is responsible for reading the custom throttling defined in requestthrottler.properties.
 * In the future, this class may not be needed as we may move towards Spring libraries
 * 
 * @ThreadSafe 
 * 
 * @author Vishal
 *
 */
public class ThrottlerConfiguration {
	
	private static final Properties properties = new Properties();

	static {
		
		InputStream pStream = ThrottlerConfiguration.class.getClassLoader().getResourceAsStream("requestthrottler.properties");
		try {
			if( pStream != null)
			properties.load(pStream);
			//fair to throw IO exception?
			else throw new IOException("Unable to load properties file");
		} catch (IOException e) {
			//TODO-vp3 logging
			System.out.println("Cannot read properties file.\n"+e);
		}
		
	}
	
	public static String getProperty(String propertyName) {
		
		return properties.getProperty(propertyName);
		
	}
	
	public static int getPropertyAsInteger(String propertyName, int defaultValue) {
		
		int integerProp = defaultValue;
		
		try {
			integerProp= Integer.parseInt(properties.getProperty(propertyName));
		}catch (NumberFormatException e) {
		    // swallow it. I will return the default value
		}
		return integerProp;
		
	}
	
	public static boolean getPropertyAsBoolean(String propertyName) {
		
		 boolean booleanProp =  Boolean.parseBoolean(properties.getProperty(propertyName));
		 
		 return booleanProp;
		
	}
	
	

}
