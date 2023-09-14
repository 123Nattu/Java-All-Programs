//common divisors of two given no's:
package loops;

public class CommanDivisor {
	public static void main(String[] args) {
		int no1 =100, no2 =60;
		//int small=0;
		//if(no1<no2)
		//small =n01;
		//else
		//small=no2;
		int small =no1<no2 ? no1 : no2; //(simplify method)
		int div = 2;
		while(div<=small)
		{
			if(no1%div ==0 && no2%div==0)
			{
				System.out.println(div);
			}
			div++;
		}
		
	}

}
