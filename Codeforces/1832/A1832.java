import java.util.Scanner;
public class A1832 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String s=sc.nextLine();
			int odd=0,even=0,k=0;
			int[] arr=new int[256]; // TO STORE OCCURENCE OF CHARACTERS
			for(int i=0;i<s.length();i++)
			{
				arr[s.charAt(i)]++;
			}
			for(int i=0;i<256;i++) // TAKE NUMBER OF EVEN AND ODD COUNTS
			{
				if(arr[i]!=0 && arr[i]%2 == 0)
					even++;
				if(arr[i]%2 != 0)
				{
					k=arr[i];
					odd++;
				}
			}
			if(even > 1) // IF IT HAS MORE THAN 1 EVEN, THERE IS ALWAYS A CHANCE TO CREATE ANOTHER PALINDROME
				System.out.println("YES");
			else if(even == 0 || (even == 1 && odd == 0)) // IF THERE IS NO EVEN THEN NO CHANCE TO CREATE NEW PALINDROME(ONLY 1 ODD CHARACTER CAN ONLY MAKE MAX 1 PALIN)
				System.out.println("NO"); // IF THERE IS 1 EVEN THEN WE NEED 1 ODD SO THAT WE CAN TRY TO MAKE PALIN
			else if(even == 1 && odd == 1 && k>1)// 1 ODD AND 1 EVEN CAN MAKE MORE THAN 1 PALIN ONLY IF COUNT OF ODD CHARACTER IS MORE THAN 1
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
}
