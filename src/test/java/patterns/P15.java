package patterns;

public class P15 {
public static void main(String[] args) {
	for(int i=7; i>=1; i--)
	{
		for(int j=1; j<=i; j++)
		{
			if(j==1 || j==i || i==7)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
}
