import java.util.Scanner;


public class Debut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Chalut comment 軋 va ?
		Scanner sc =  new Scanner(System.in);
		System.out.println("Quelle est votre moyenne ? ");
		int a = sc.nextInt();
		switch (a)
		{
		case 0:
			System.out.println("Petit ! tu n'auras jamais ton bac ! ");
			break;
		case 10:
			System.out.println("Peut 黎re que tu peux songer �avoir ton brevet, peut 黎re... ");
			break;
		case 20:
			System.out.println("Impossible ! ");
			break;
			default:
				if (a <10 && a >0)
				{
					System.out.println("C'est pas encore ça !");
				}
				else 
				{
					System.out.println("Petit ! Vous finirez sdf sous les ponts ! ");
				}
				
		}
		
		
		
		
	}

}
