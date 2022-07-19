package patterns;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		[5]
//		 
//	  	*
//	  	##
//	  	***
//	  	####
//	  	*****
//	 

	
		
		int i,j;
		
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				if(i%2==1) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
