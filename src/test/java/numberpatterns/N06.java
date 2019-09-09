package numberpatterns;

public class N06 {
public static void main(String[] args) {
	for(int i=7; i>=1; i--)
	{
		int k=i;
		for(int j=1; j<=i; j++)
		{
			System.out.print(k--);
		}
		System.out.println();
	}
}
}
