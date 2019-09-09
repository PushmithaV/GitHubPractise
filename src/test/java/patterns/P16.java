package patterns;

public class P16 {
public static void main(String[] args) {
	for(int i=1; i<=7; i++)
	{
		for(int s=i; s<7; s++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=13; j++)
		{
			if(j==1 || j==(i*2)-1 || i==7)
			{
				System.out.print("*");
			}else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
