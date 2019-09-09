package patterns;

public class P19 {
public static void main(String[] args) {
	int k=12;
	for(int i=1; i<14; i++)
		{
	
		if(i<=7)
		{
			for(int s=i; s<7; s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<14; j++)
			{
				if(j==1 || j==(i*2)-1)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
		}
		else
		{
			for(int s=1; s<i-6; s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<14; j++)
			{
				if(j==1 || j==k)
				{
					System.out.print("*");
					k--;
				}else
				{
					System.out.print(" ");
				}
			}
		}
	
		System.out.println();
	}
}
}
