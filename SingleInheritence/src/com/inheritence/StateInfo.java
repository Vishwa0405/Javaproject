package com.inheritence;


public class StateInfo extends Language{
	
	public void southIndia() {
		System.out.println("TamilNadu");
		}
	public void northIndia() {
		System.out.println("Delhi");
		
	}
public static void main (String[]args) {
	StateInfo s = new StateInfo();
	
	s.southIndia();
	s.northIndia();
	s.englishLanguage();
	s.hindiLanguage();
	s.tamilLanguage();
}

}
