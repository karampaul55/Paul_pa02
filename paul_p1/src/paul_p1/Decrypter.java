package paul_p1;
import java.util.* ;

public class Decrypter {

	public void decrypt() 
	{
		Scanner in = new Scanner(System.in);
		int n = 4; //number of digits
		int[] encrypted = new int[n];
		int[] decrypted = new int[n];


		
		System.out.println("Please enter your 4-digit interger for decryption: ");
		for (int i = 0 ; i < n ; i++)
		{
			//Using j as a swapping tool 
			int j = i + 2;
			encrypted[i] = in.nextInt(); // 0 -2 8 5
			
			if (j == 4)
			{
				j = 0;
			}
			if (j == 5)
			{
				j = 1;
			}
			
			
			decrypted[j] = (encrypted[i]+ 3) % 10; 	// Mathematically derived when looking at the reverse modulus 10
			
		}
		in.close();
		System.out.println("4-digit Decryption Complete: " + Arrays.toString(decrypted));		
	}

}

