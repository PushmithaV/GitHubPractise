package numberpatterns;

public class N09 {
public static void main(String[] args) {
	for(int i=1; i<14; i++)
	{
		if(i<=7)
		{
			for(int j=1; j<=8-i;j++)
			{
				System.out.print(j);
			}
		}else
		{
			for(int j=1; j<=i-6; j++)
			{
				System.out.print(j);
			}
		}
		System.out.println();
	}
}
}
