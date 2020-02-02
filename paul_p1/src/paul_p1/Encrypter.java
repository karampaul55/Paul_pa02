package paul_p1 ;
import java.util.* ;

public class Encrypter {
	
	public void encrypt() 
	{
		Scanner in = new Scanner(System.in);
		int n = 4 ; //number of digits
		int[] original = new int[n]; 
		int[] encrypt = new int[n];
		int[] encrypted = new int[n];

		System.out.println("Please enter your 4-digit interger for encryption: ");
		for (int i = 0 ; i < n ; i++)
		{
			int j = i;								
			original[i] = in.nextInt();
			encrypt[i] = (original[i] + 7) % 10 ; 			//Encryption Algorithm
			
			//using j as a swapping tool 
			j = i + 2; 
			
			if (j == 4) 						
			{
				j = 0;
			}
			if (j == 5)
			{
				j = 1;
			}
			
			encrypted[j] = encrypt[i];
		}
		System.out.println("4-digit Encryption Complete: " + Arrays.toString(encrypted) + "\n");
	}
}
