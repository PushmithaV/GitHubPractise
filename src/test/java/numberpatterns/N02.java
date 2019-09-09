package numberpatterns;

public class N02 {
public static void main(String[] args) {
	for(int i=1; i<=11; i++)
	{
		if(i<=6)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
		}else
		{
			for(int j=1; j<=12-i; j++)
			{
				System.out.print(j);
			}
		}
		System.out.println();
	}
}
}
