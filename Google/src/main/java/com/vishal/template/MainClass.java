package com.vishal.template;

public class MainClass {

	public static void main(String[] args) {

		TemplateExample<String> templateExample = new TemplateImplementor();
		System.out.println(templateExample.testMethod(10));
		
		TemplateExample<Integer> tExample = new TemplateExample<Integer>() {
			
			@Override
			public Integer testMethod(int a) {
				return 55;
			}
		};
		
		System.out.println(tExample.testMethod(15));
	}

}
