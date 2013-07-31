import java.util.Scanner;


public class Debut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Chalut comment 軋 va ?
		
		String prenom = null;
		String humeur = "bien";
		char reponse = 'O';
		Scanner sc =  new Scanner(System.in);
		while (reponse == 'O' )
		{
			do{
			System.out.println("Bonjour, quel est votre prénom ?");
			prenom = sc.nextLine();
			System.out.println("Bonjour  " +prenom+ " comment allez vous ? ");
			
			
			do{
				System.out.println("Voulez vous ressayer ? (O/N) ");
				reponse = sc.nextLine() .charAt(0);
			}while (reponse != 'O' && reponse != 'N');
			}while (reponse == 'O');
			
			
	
		}
				System.out.println("Aurevoir " +prenom+ " et bonne journée. ");
		
		
		
		
		
	}

}
