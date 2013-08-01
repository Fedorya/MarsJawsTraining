import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char reponse = ' ', choix = ' ';
		
		//HELP !
				System.out.println(" CONVERTISSEUROTRON 9000 DE DEGRÉS FAHRENHEIT/CELSIUS");
				System.out.println("------------------------------------------------------");
				
			do{ 
			do{
			
				System.out.println("Veuillez choisir le mode de conversion : ");
				System.out.println("1 - Conversion degrés Celsius -> Fahrenheit :");
				System.out.println("2 - Conversion degrés Fahrenheit -> Celsius :");
				
			choix = sc.next() .charAt(0);
			
			if (choix != '1' && choix != '2');
				System.out.println("Choix inconnu, veuillez saisir un choix correct. ");
				
			}while (choix == 1 && choix == 2);
				
			if (choix == 1) {
				System.out.println("(Celsius -> Fahrenheit) Température à convertir : ");
				sc.nextLine();
			float c = sc.nextFloat();
			float f = (float) (9.0/5.0*c+32);
				System.out.println(" " +c+ " °C correspond à : " +f+ " °F. ");
			}
				
			
			else {
				
			float f1 = sc.nextFloat();
			float c = (float) (f1-32*5/9);
				System.out.println(" " +f1+ " °F correspond à : " +c+ " °C.");
			}
			
			
			do {
				System.out.println("Voulez-vous convertir une autre température O/N ? ");
			reponse = sc.next() .charAt(0);
			
			}while (reponse != 'O' && reponse != 'N');
			}while (reponse == 'O');
		
				System.out.println("Bye bye !");
			
	    
	}
		
		
	}
