import java.util.Scanner;
//Pewds was here !


public class ConvertisseurCF {

	public static void main(String[] args) {

		char restart = 'O';
		int chx = 0;
		int farh;
		double tempin;
		double tempout;

			
		Scanner sc = new Scanner (System.in);
		
				while (restart == 'O')
				{
		
					
					while (chx != 1 && chx != 2)
					{
						System.out.println("Choisissez le mode de conversion : ");
						System.out.println("1 - Convertisseur Celsius -> Fahrenheit.");
						System.out.println("2 - Convertisseur Celsius <- Fahrenheit.");
						chx = sc.nextInt();
					}
					
					if (chx == 1)
					{
						System.out.println("Température en °C que vous souhaitez convertir en °F : ");
						tempin = sc.nextInt();
						tempout = ((9.0/5.0) * tempin) + 32.0;
						
						System.out.println(+tempin+ " °C sont égaux a " +tempout+ " °F.");
						sc.nextLine();
						restart = ' ';
						chx = 0;						
						while (restart != 'O' && restart != 'N')
						{
							System.out.println("Souhaitez vous recommencer O/N ?");
							
							restart = sc.nextLine().charAt(0);
						}
							
									
						
					}
					
					else
					{
						System.out.println("Température en °F que vous souhaitez convertir en °C : ");
						tempin = sc.nextInt();
						tempout = ((tempin - 32) * 5) / 9;
						
						System.out.println(+tempin+ " °F sont égaux a " +tempout+ " °C.");
						sc.nextLine();
						restart = ' ';
						chx = 0;						
						while (restart != 'O' && restart != 'N')
						{
							System.out.println("Souhaitez vous recommencer O/N ?");
							
							restart = sc.nextLine().charAt(0);
						}
						
					}
					
				}
	}	
	
}
