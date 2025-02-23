class Pattern7{
	public static void main(String args[]){
		int n = 3; 

        	for (int i = 1; i <= n; i++) {  
            		
            		for (int j = i; j < n; j++) {
                		System.out.print(" ");
            		}
            
            		for (int k = 1; k <= 2*i-1; k++) {
                		System.out.print("* ");
            		}
            		System.out.println(); // Move to the next line
        	}
		// Number of rows

        	for (int i = 4; i >= 1; i--) {  
            
            		for (int j = i; j < 4; j++) {
                		System.out.print(" ");
            		}
            
            		for (int k = 1; k <= i; k++) {
                		System.out.print("* ");
            		}
            		System.out.println(); // Move to the next line
        	}

	}
}