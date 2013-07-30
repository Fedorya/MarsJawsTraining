import java.util.Scanner;


public class posneg {

	public static void main(String[] args) {
		
		//Revision 0.2 :
		//Mix entre le scanner et les conditions.
		
		//Revision 0.3 :
		//Ajout du localisateur numérique..
		
		System.out.println("Entrez un chiffre positif ou négatif.");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		if (i < 0){
			System.out.print("Le résultat est négatif");
		}
		
		else if (i == 0){
			
			System.out.print("Le résultat est de zéro");
		}
		
		else{
			System.out.print("Le résultat est positif");
			
		}
		
		int j = i;
		if (j >= 0 && j <= 100){
			System.out.print(" ainsi que compris entre 0 et 100");
		}
		else if (j >= 100){
			System.out.print(" ainsi que supérieur a 100");
			
		}
		
		if (j <= 0 && j >= -100){
			System.out.print(" ainsi que compris entre 0 et -100");
		}
		
		else if (j <= -100){
			System.out.print(" ainsi qu'inférieur a -100");
		}
		
		}
	}


