package loops;

public class PowerDemo {
	public static void main(String[] args) {
	PowerDemo pd=new PowerDemo();
	int no = 1;                           
	while(no<=5)                                   
	{                              //3                    // 3 3 3 3 3(power)          
	pd.find_power3(no,3);                             //1 2 3 4 5(base)
	no= no+1;                                      
	}      
	
//	 pd.find_power(1,1);
//	 pd.find_power(2,2);
//	 pd.find_power(3,3);
//	 pd.find_power(4,4);
//	 pd.find_power(5,5);                            
	   //0   (or)
	//int no = 1;                             
	//while(no<=5)                                   
	//{                               //1                   // 0 1 2 3 4(power)          
	//pd.find_power1(no,no-1);                               //1 2 3 4 5(base)
	//no= no+1;                                      
	//}                                               
	}  
	
	//int no = 1;                             
	//while(no<=5)                                   
	//{                              //2                    // 2 3 4 5 6(power)          
	//pd.find_power2(no,no+1);                             //1 2 3 4 5(base)
	//no= no+1;                                      
	//}  
	
	
	
	
	
private void find_power3(int base,int power) {   //1
	
	int no = 1;
	while (power>0)
	{
		no=no*base; //4
		power=power-1;//0
	}
	System.out.println(no); 
}

//private void find_power2(int base,int power) {   //1
	
	//int no = 1;
	//while (power>0)
	//{
		//no=no*base; //4
		//power=power-1;//0
	//}
	//System.out.println(no); 
	//private void find_power1(int base,int power) {   //1
		
		//int no = 1;
		//while (power>0)
		//{
			//no=no*base; 
			//power=power-1;
		//}
		//System.out.println(no); 
	}


