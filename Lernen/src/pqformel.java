import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class pqformel {

	public static void main(String[] args) {
		//main
		//System.out.println(sayHello());
		//System.out.println(PP(6, 1));
		//RandomGen();
		//Wochentage(4, 3, 2020);
		//Quadratzahlen();
		//Dreieck(3, 3);
		doSomeCock();
	}
	//{Sichtbarkeit} {static} [DatenTyp / void] [Name] {Parameter}
	
	
	
	public static PointerClass PP(double p, double q) {
		
		double x1 = 0;
		double x2 = 0;
		
		double firstPart = (-1)*(p / 2);
		double secondPart = Math.sqrt(Math.pow(p / 2, 2) - q);
		
		x1 = firstPart + secondPart;
		x2 = firstPart - secondPart;
		return new PointerClass(x1, x2);
	}
	
	private static String sayHello() {
		return "hi bitch";
	}
	
	
	public static void RandomGen() {
		
		int highestNumber = 100;
		
		int[] array = {2, 3, 5, 8, 100, 12, 54, 65, 23, 53, 56};
		
		boolean isAllowedToGenerate = true;
		
		for(int element : array) {
			if(element > highestNumber) {
				isAllowedToGenerate = false;
			}
		}
		if(isAllowedToGenerate) {
		int zufallszahl = new Random().nextInt(highestNumber) + 1;
		System.out.println(""+ zufallszahl);
		for(int i = 0; i < 5; i++ ) {
			
			if(array[i] == zufallszahl) {
				
				System.out.println("YAY IM GAY");
			}
			else {
				if(array[i] < zufallszahl) {
					System.out.println("Zufallszahl ist Größer");
				}
				else {
					System.out.println("Zufallszahl ist Kleiner");
				}
				}
			}
		}
	}
	
	public static void Wochentage(int tag, int monat, int jahr) {
		
		int h = 0;
		int k = 0;
		int Wochentag = 0;
		
		
		if(monat <= 2) {
			h = monat + 12;
			k = jahr - 1;
			
		}
		else {
			h = monat;
			k = jahr;
		}
		
		Wochentag = (tag + 2 * h + ( 3 * h + 5) / 5 + k + k / 4 - k / 100 + k / 400 + 1) % 7;
		
		
		Map<Integer, String> myCock = new HashMap<>();

		myCock.put(0, "Sonntag");
		myCock.put(1, "Mondach");
		myCock.put(2, "Dinnsdag");
		myCock.put(3, "Mettwoch");
		myCock.put(4, "Donnerschtag");
		myCock.put(5, "Freitag");
		myCock.put(6, "Samstag");
		
		System.out.println(myCock.get(Wochentag));
		
	}
	public static void Quadratzahlen() {
		
		double zahl = 0;
		double quadrat = 0;
		
		for(int i = 0; i < 10; i++) {
			
			quadrat = Math.pow(++zahl, 2);
			int quadratergebnis = (int) quadrat;
			
			System.out.println("Hallo ich bin For Schleife Fetischistenbot namens Leopardon    : "+quadratergebnis);
		}
		
		System.out.println(" ");
		int i = 0;
		do {
		
		i++;
		quadrat = Math.pow(++zahl, 2);
		int quadratergebnis = (int) quadrat;
		System.out.println("Hallo ich bin Fußgesteuerter Fetischistenbot namens Leopardon  : "+ quadratergebnis);
		}
		while(i < 10)
		;
		
		i = 0;
		quadrat = 0;
		zahl = 0;
		System.out.println(" ");
		
		while(i < 10) {
			i++;
			quadrat = Math.pow(++zahl, 2);
			int quadratergebnis = (int) quadrat;
			System.out.println("Hallo ich bin Kopfgesteuerter Fetischistenbot namens Leopardon : "+ quadratergebnis);
		}
	}
	
	public static void Dreieck(int anzahl, int groesse) {
		
	
		
		for(int i = 0; i < groesse; i++) {
			
			for(int e = 0; e < anzahl; e++) {
				System.out.print(String.join("", Collections.nCopies(e+1, "*"))+"\n");
			}
			
			System.out.println("");
			
		}
		
	}
	
	public static void doSomeCock() {
		
		int[] cocks = {5123, 3, 412, -213, 423};
		int ergebnis1 = 0;
		int ergebnis2 = 0;
		int i;
		
		/*
		 * 
		 *  jede dritte Zahl zsm rechnen und ausgeben
		 *  Wenn weniger als 3 übrig sind einfach diese addieren und ausgeben
		 * 
		 */
		for(i = 0; i < 3; i++) {
			
			ergebnis1 += cocks[i];
			
		}
		ergebnis2 = (cocks[i])+cocks[i+1];
		System.out.println("Jede dritte Zahl zusammengerechnet ist : "+ergebnis1);
		System.out.println("Der Rest zusammengerechnet ist         : "+ergebnis2);
		
		//int ergebnis2 = cocks[i+1] + cocks[i+1];
		//System.out.println();
	}
	
	
	
}