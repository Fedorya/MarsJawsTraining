import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		char retour = 'O';
		int choix = 0;
		double euro;
		double dollar;
		
			
			while (retour == 'O');
			{
				
			
				while (choix != 1 && choix != 2);
				{
					
					System.out.println("Convertissator le convertisseur de devises. ");
					System.out.println("1 - Convertir de l'euro -> dollar : ");
					System.out.println("2 - Convertir du dollar -> euro : ");
					choix = sc.nextInt();
					
				}
	    
				if (choix == 1)
				{
					System.out.println("(Euro -> Dollar) Veuillez la valeur que vous souhaitez convertir : ");
					euro = sc.nextDouble();
					dollar = (euro*1.32);
					System.out.println(" " +euro+ " € valent " +dollar+ ".");
					sc.nextLine();
					retour = ' ';
					choix = 0;
					
					while (retour != 'O' && retour != 'N');
					{
						System.out.println("Voulez vous convertir une autre devise O/N ?");
						retour = sc.nextLine().charAt(0);
						
					}
					
				}
						
				else 
				{
					System.out.println("(Dollar -> euro) Veuillez saisir la valeur que vous souhaitez convertir :");
					dollar = sc.nextDouble();
					euro = (dollar/1.32);
					System.out.println(" " +dollar+ " $ valent " +euro+ " €.");
					sc.nextLine();
					retour = ' ';
					choix = 0;
							
					while (retour != 'O' && retour != 'N')
					{
						System.out.println("Voulez vous convertir une autre devise O/N ?");
						retour = sc.nextLine().charAt(0);
							
					}
					
				
						
				}
					
				    System.out.println("Au revoir !");
			}
	}
		
		
	}
