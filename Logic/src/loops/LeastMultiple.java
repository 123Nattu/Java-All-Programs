//least common multiple(lcm)
package loops;

public class LeastMultiple {
	public static void main(String[] args) {
		LeastMultiple scd = new LeastMultiple();
		scd.find_lcm(2,4);
		
	}

	private void find_lcm(int no1, int no2) {
		int big = no1>no2?no1:no2;
		int count=0;
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				if(count<3)
				{
				System.out.println("lcm is "+ big);
				count++;
				}
			}
			
			big++;
		}
				
	}

}
