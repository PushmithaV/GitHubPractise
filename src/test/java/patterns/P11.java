package patterns;

public class P11 {
public static void main(String[] args) {
	for(int i=1; i<10; i++)
	{
		if(i<=5)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
		}else
		{
			for(int j=5; j>=i-4;j--)
			{
				System.out.print("*");
				
			}
		}
		System.out.println();
	}
}
}
