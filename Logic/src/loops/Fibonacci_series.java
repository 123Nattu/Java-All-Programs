package loops;

public class Fibonacci_series {
	int count=0;

	public static void main(String[] args) {
		Fibonacci_series fibo = new Fibonacci_series();
		fibo.print_fibo(0,1);
		
	}

	private void print_fibo(int first, int second) {
		while(count<=10)
		{
		System.out.print(first+" ");
		//int third = first + second;
		second=second+first;
		first=second-first;
		count++;
	}
	}

}
