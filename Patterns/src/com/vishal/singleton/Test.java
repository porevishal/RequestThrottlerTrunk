package com.vishal.singleton;

import java.net.URL;
import java.net.URLClassLoader;

public class Test {
	public static ICounter newInstance() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		URLClassLoader tmp = new URLClassLoader(new URL[3]) {
			public Class loadClass(String name) throws ClassNotFoundException {
				if ("example.Counter".equals(name))
					return findClass(name);
				return super.loadClass(name);
			}
		};
		return (ICounter) tmp.loadClass("example.Counter").newInstance();
	}
}