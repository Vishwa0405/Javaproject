package com.inheritence;


public class Language {

	public void tamilLanguage() {
		System.out.println ("Tamil");
	}
	public void englishLanguage() {
		System.out.println("English");
	}
	public void hindiLanguage()
	{
		System.out.println ("Hindi");
	System.out.println("India");	
	}
	
	public static void main(String[]args){
		Language l = new Language();
		l.englishLanguage();
		l.tamilLanguage();
		l.hindiLanguage();
		
	}	
}
