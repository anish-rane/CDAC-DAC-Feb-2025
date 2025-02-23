class Pattern2{
	public static void main(String args[]){
		for(int i=1; i<6;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(i);
				if(j<i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//Lower triangle
		for(int i=5; i>0;i--)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(i);
				if(j<i)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}
}