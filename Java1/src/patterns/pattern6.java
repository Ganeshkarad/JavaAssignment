package patterns;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		6.
//		 
//	  	1
//	  	**
//	  	4*6
//	  	*8910

		
		

		
	
		int i,j,k=1,count;
		
		for(i=1;i<5;i++)
		{
			for(j=1;j<=i;j++)
			{
				count=0;
				for(int q=1;q<=k;q++)
				{
					if(k%q==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print("* ");
					k++;
				}
				else
				{
					System.out.print(k+++" ");
				}
			}
			System.out.println();
		}
		
	}
}







/*int i,j,k=1;
		
		for(i=1;i<5;i++) {
			for(j=1;j<=i;j++) {
				
				if(k%2==0) {
					System.out.print(k+++" ");
					
					
				}
				else {
					System.out.print(k+++" ");
				}
			}
			System.out.println();
		
			}
		
		}}*/
		
		
		
		
		
		



