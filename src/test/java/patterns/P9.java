package patterns;

public class P9 {
public static void main(String[] args) {
	for(int i=1; i<11; i++)
	{
		if(i<=5)
		{
			for(int s=1; s<i; s++)
			{
				System.out.print(" ");
			}
			for(int j=5; j>=i; j--)
							{
				System.out.print("*");
			}
		}
		else
		{
			for(int s=5; s>=i-4; s--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i-5; j++)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
