//1011
package loops;

public class Binary_Decimal 
{
	public static void main(String[] args)
	{
		Binary_Decimal bd = new Binary_Decimal();
		bd.split_digit(1011);
		
	}

	private void split_digit(int binary) //binary=1101
	{
		int p = 0;
		//int decimal = 0;
		while(binary>0)//1>0
		{
			int rem = binary%10;// 1
			
			int result = rem * find_power(2,p);
			System.out.println(result); //1,0,0,8
			p = p+1;//3
			//decimal = decimal +result;//1+0+0+8
			binary = binary/10;//1
		}//System.out.println(decimal);
		
		
	}
private int find_power(int base,int power) 
{
		
		int no = 1;
		while (power>0)
		{
			no=no*base; //8
			power=power-1;
		}
		//System.out.println(no);
		return no;
	}

}
