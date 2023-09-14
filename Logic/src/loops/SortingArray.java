package loops;

public class SortingArray {
	public static void main(String[]arg) {
		SortingArray sd = new SortingArray();
		//sd.learnig_1();// sorting for first,second,third number(bubble sort)and also find the ascending and descending order
	    // sd.learning_2();//removal of duplicates from an ordered array
		sd.learning_3();// sub array 
		               //  
	}

	private void learning_3() {
		int [] a = {20,30,10};
	//  int [] b = {10,20}; // sub array	
		int [] b = {10,25}; // not sub array 
		int count =0;
		for(int j=0; j<b.length; j++) {
			boolean present = false;
			for(int i=0; i<a.length; i++) {
				if(b[j] == a[i])
				{
					count++;
					present = true;
				}
			}
			if(present == false)
			{
				System.out.println("Not sub Array");
				break;
			}
		}
		if(count == b.length) {
			System.out.println("Sub Array");
		}
	}

	private void learning_2() {
		int[]ar = {20,20,20,30,30,40,40,50,60,70,70,70};
		int unique = 1;
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i]!=ar[i+1]) {
				ar[unique] = ar[i+1];
				unique++;
			}
				
		}
		for(int i=0;i<unique;i++)
			System.out.println(ar[i]+" ");
	}

	private void learnig_1() {
	int[] ar = {100,90,80,70,83,92,67,35,98,96};
	//for(int j =1; j<4; j++) // for ordering the first third highest value
	for(int j =1; j<=ar.length; j++) // used for full array highest value
	{
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i]>ar[i+1]) // for ascending order
				//if(ar[i]<ar[i+1]) //for descending order
			{
				int temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = temp;		
			}
		}
		System.out.println(ar[ar.length-j]);
		
	}
	}
}
