//greatest common divisor
package loops;

public class GreatestDivisor {
	public static void main(String[] args) {
		
	GreatestDivisor gcd = new GreatestDivisor();
	gcd.find_gcd(100,120);
	
	}

	private void find_gcd(int no1, int no2)
	{
	//int div =2;                        //whileloop
	int gcd =0;
	int small = no1<no2?no1:no2;
	for(int div =2;div<=small;div++)   //forloop
	//while(div<=small)                //whileloop
	{
		if(no1%div ==0 && no2%div==0)
		{
			gcd = div;
		}
		//div++;                       //whileloop
	}
	System.out.println("gcd is "+ gcd);
	}
}
