package loops;

class PrimeNumber2{
	public static void main(String[]args) 
	{
	PrimeNumber2 pp=new PrimeNumber2();
	int no=2;
	while(no<=20)
	{
		pp.find_prime(no);
		no=no+1;
	}
	}
	void find_prime(int no) 
	{
		int div=2;
		int count=0;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println(no + "NOT PRIME");
				count=count+1;
				break;
			}
			div=div+1;
		}
		if(count==0)
			System.out.println(no+"PRIME");
	}
}