package numberpatterns;

public class N10 {
public static void main(String[] args) {
	for(int i=1; i<14; i++)
	{
		int k=i;
		if(i<=7)
		{
			for(int s=1; s<i; s++)
			{
				System.out.print(" ");
			}
			for(int j=7; j>=i; j--)
			{
				System.out.print(k++);
			}
		}
		else
		{
			k=14-i;
			for(int s=1; s<=13-i; s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i-6; j++)
			{
				System.out.print(k++);
			}
		}	
		System.out.println();
	}
}
}
