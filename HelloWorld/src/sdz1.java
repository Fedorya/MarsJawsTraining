import java.util.Scanner;


public class sdz1 {

	public static void main(String[] args) {
		
		//Mix entre le scanner et les conditions.
		
		System.out.print("Entrez un chiffre positif ou négatif.");
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
		
		}
	}


