package loops;
 class PrimeNumber {
	 int prime_count=0;
	public static void main(String[] args) {
		PrimeNumber pp = new PrimeNumber();
		pp.find_prime(2);
	}
		void find_prime(int no)
		{
			int div =2;			
		    int count=0;
			while(div<=no/2)
			{
				if(no%div==0)
				{
					//System.out.println("NOT PRIME");
					count=count+1;
					break;
				}
				div=div+1;
			}
			if(count==0)
			{
				System.out.println(no+" PRIME");
				prime_count=prime_count+1;
			}
			if(prime_count<=5)
			{
				no=no+1;
				find_prime(no);
				
			}
	}
}
