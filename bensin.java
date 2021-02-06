//**************************

//Skrivet av: Daniel Bjärby

//Datum: 21/02/05

//Beskrivning: Uppgift 4, del 2. Skriv ett program som räknar ut bensinförbrukning.

//**************************

import java.util.Scanner;

public class bensin {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      while (ask(in)) {}
      in.close();
  }

  static boolean ask(Scanner in) {
			System.out.println("Vad är antalet liter?");
		  float liter = in.nextInt();

		  System.out.println("Vad är antalet kilometer? ");
		  float km = in.nextInt();
		  
		  System.out.println("Vill du ha svaret enligt EU- eller US-standard? Svara 'E' eller 'U' ");
		  String unit = in.next();
		  
		  if (unit.equals("E")) {
			  myMethod(liter, km);
		  }
		  else {
			  inGallons(liter, km);
		  }

		  System.out.println("En gång till? (J/N)");
		  String userChoice = in.next();
      
      return (userChoice.equals("J"));
  }

	static void myMethod(float liter, float km) { 
		  float hundredKM = ((liter / km) * 100);
		  System.out.println("Förbrukningen i liter per 100 km är: " + hundredKM);
	  }	
	
	static void inGallons(float liter, float km) { 
		float miles = (float) (km / 1.609);
		float gallons = (float) (liter * 0.264172);
		float mperGallon = miles / gallons;
		System.out.println("Förbrukningen i gallons per 1 mile är: " + mperGallon);
	  }	
}
