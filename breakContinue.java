

public class breakContinue {
	
	public static void main(String[]args) {
		 
		for(int i=0;i<=10;i++) {
			if(i==7) {
				continue;
			}                                      //here the continue will not print the output at the condition 
			System.out.println("Value is : "+i);
		}
		
	}

}
