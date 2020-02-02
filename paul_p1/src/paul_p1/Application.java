package paul_p1;

public class Application {
	
	public static void main(String[] args) 
	{
		Encrypter Encrypter = new Encrypter();
		Encrypter.encrypt();
		
		Decrypter Decrypter = new Decrypter();
		Decrypter.decrypt();
	}
}
