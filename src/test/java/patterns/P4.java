package patterns;

public class P4 {
public static void main(String[] args) {
	
	for(int i=5; i>=1; i--)
	{
		
		for(int s=i-1; s>0; s--)
		{
			System.out.print(" ");
		}
		for(int j=5; j>=i; j--)
		{
			System.out.print("* ");
			
		}
		System.out.println();
	}
}
}
