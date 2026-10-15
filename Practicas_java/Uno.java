package martes;

public class Uno {
	public static void main(String[] args) {
		System.out.println("-----------PARES----------");
		
		for (int i=1;i<100;i++)
		
			if ((i%2)==0)
				System.out.println(i);
				
		System.out.println("-----------IMPARES----------");
		
		int j=1;
		
		while(j<=100) {
		
			if ((j%2)==1)
				System.out.println(j);
			j++;
		}
	}
} 