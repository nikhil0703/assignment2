import java.util.Scanner;
public class palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String word=sc.nextLine();
		
		while(true)
		{
			
			int l=word.length();
			String reverse="";
			for(int i=l-1;i>=0;i--)
				reverse=reverse+(word.charAt(i));
			
			if(word.equals(reverse))
				System.out.println("It is palindrome.");
			else
				System.out.println("It is not palindrome.");
			
			System.out.println("Enter the next string:");
			word=sc.nextLine();
			if("GSCRnsit".equals(word))
			{
				System.out.println("GSCRnsit entered.Input process terminated...!!");
				break;
			}
			
		}
		
			
	
	
	}

}