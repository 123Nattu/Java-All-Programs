package loops;

public class pattern {

	public static void main(String[] args) 
		 {
		  pattern pd = new pattern();
		  //pd.pattern1();
		  //System.out.println("_______________________________");
		 // pd.patten2();
		  //System.out.println("_______________________________");
		  //pd.pattern3();
		  //System.out.println("_______________________________");
		  //pd.pattern4();
		  //System.out.println("_______________________________");
		 // pd.pattern5();
		  //System.out.println("_______________________________");
		  //pd.patten6();
		  //System.out.println("_______________________________");
		 // pd.pattern7();
		  //System.out.println("_______________________________");
		 // pd.pattern8();
		  //System.out.println("_______________________________");
		 // pd.pattern9();
		  //System.out.println("_______________________________");
		 // pd.pattern10();
		  //System.out.println("_______________________________");
		 // pd.pattern11();
		 // System.out.println("_______________________________");
		  //pd.pattern12();
		//  System.out.println("_______________________________");
		  //pd.pattern13();
		 // System.out.println("_______________________________");
		  //pd.pattern14();
		  //System.out.println("_______________________________");
		 // pd.pattern15();
		  //System.out.println("_______________________________");
		  pd.pattern16();
		  System.out.println("_______________________________");
		  pd.pattern17();
		  System.out.println("_______________________________");
		  pd.pattern18();
		  System.out.println("_______________________________");
		  pd.pattern19();
		  System.out.println("_______________________________");
		  pd.pattern20();
		  System.out.println("_______________________________");


		 }

		 

		 


		private void pattern20() {
			for(int row=1;row<=7;row++)	{
				for(int col=1;col<=7;col++) {
				if(row==1&&col==4||row==2&&col==3||row==2&&col==5|row==3&col==2||row==3&&col==6||row==4&&col==3||row==4&&col==5||row==5&&col==4)
					System.out.print("* ");
				else
					System.out.print("  ");
				}
				System.out.println();
			}			
	}






		private void pattern19() {
			for(int row=1;row<=7;row++)	{
				for(int col=1;col<=7;col++) {
				if(row-col==3&&row>=4||row+col==11&&row>=4||row+col==4&&row>1&&row<=4||row==3&&col==4||col-row==4&&row<=4&&row>1)
					System.out.print("* ");
				else
					System.out.print("  ");
				}
				System.out.println();
			}			
		
	}






		private void pattern18() {
			for(int row=1;row<=7;row++)	{
				for(int col=1;col<=9;col++) {
				if(row==1||col==5)
					System.out.print("* ");
				else
					System.out.print("  ");
				}
				System.out.println();
			}			
	}






		private void pattern17() {
			for(int row=1;row<=7;row++)	{
				for(int col=1;col<=9;col++) {
				if(row+col==7&&row>1||col-row==3&&row>1||row==4&&col>2&&col<7)
					System.out.print("* ");
				else
					System.out.print("  ");
				}
				System.out.println();
			}		
	}






		private void pattern16() {
		for(int row=1;row<=7;row++)	{
			for(int col=1;col<=7;col++) {
			if(col==1||col==7||row==col)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
			
	}






		private void pattern15() {
			for(int row=1;row<=7;row++) {
				  for (int col=1;col<=7;col++) {
					  if(row==1 || row==4 || row==7)
						  System.out.print("* ");
					  else if((row<=4 && col==7)||(row>4 && col==1))
				    System.out.print("* ");
					  else
						  System.out.print("  ");
				  }
				  System.out.println();
				  
				 }				
	}






		private void pattern14() {
			for(int row=1;row<=7;row++) {
				  for (int col=1;col<=7;col++) {
					  if(row==1 || row==4 || row==7)
						  System.out.print("* ");
					  else if((row<=4 && col==1)||(row>4 && col==7))
				    System.out.print("* ");
					  else
						  System.out.print("  ");
				  }
				  System.out.println();
				  
				 }		
	}






		private void pattern13() {
			for(int row=1;row<=7;row++) {
				  for (int col=1;col<=7;col++) {
					  if(row==1 || row==4|| row==7||col==7)
				    System.out.print("* ");
					  else
						  System.out.print("  ");
				  }
				  System.out.println();
				  
				 }		
	}






		private void pattern12() {
			for(int row=1;row<=7;row++) {
				  for (int col=1;col<=7;col++) {
					  if(row==1 || row==4|| row==7||col==1)
				    System.out.print("* ");
					  else
						  System.out.print("  ");
				  }
				  System.out.println();
				  
				 }
				
	}






		private void pattern11() {
			 for(int row=1;row<=7;row++) {
				  for (int col=1;col<=7;col++) {
					  if(row==1 || row==4|| row==7||col==1||col==7)
				    System.out.print("* ");
					  else
						  System.out.print("  ");
				  }
				  System.out.println();
				  
				 }
		
	}






		private void pattern10() {
			 for(int row=1;row<=7;row++) {
				   for (int col=1;col<=7;col++) {
				    if(col==row && (col<=4)|| (row+col==8 && col>=4)|| col==1 || col==7 )
				    System.out.print("* ");
				    else
				     System.out.print("  ");
				   }
				   System.out.println();
				   
				  }		
	}



		private void pattern9() {
			 for(int row=1;row<=7;row++) {
				   for (int col=1;col<=7;col++) {
				    if(col==row &&(col<=4)|| row+col==8)
				    System.out.print("* ");
				    else
				     System.out.print("  ");
				   }
				   System.out.println();
				   
				  }		
	}



		private void pattern8() {
			 for(int row=1;row<=7;row++) {
				   for (int col=1;col<=7;col++) {
				    if(col==row || row+col==8)
				    System.out.print("* ");
				    else
				     System.out.print("  ");
				   }
				   System.out.println();
				   
				  }
	}



		private void pattern7() {
		  for(int row=1;row<=7;row++) {
		   for (int col=1;col<=7;col++) {
		    if(col==1 || col==7||col==row)
		    System.out.print("* ");
		    else
		     System.out.print("  ");
		   }
		   System.out.println();
		   
		  }
		  
		  
		 }

		 private void patten6() {
		  for(int row=1;row<=7;row++) {
		   for (int col=1;col<=7;col++) {
		    if(col==1 || col==row)
		    System.out.print("* ");
		    else
		     System.out.print("  ");
		   }
		   System.out.println();
		   
		  }
		  
		  
		 }

		 private void pattern5() {
		  for(int row=1;row<=7;row++) {
		   for (int col=1;col<=7;col++) {
		    if(col==1)
		    System.out.print("* ");
		   }
		   System.out.println();
		   
		  }
		  
		  
		 }

		 private void pattern4() {
		  for(int row=1;row<=7;row++) {
		   for (int col=1;col<=7;col++) {
		    if(row==1|| row==7 || col==1 ||col==7) {
		     if (row==1 && col==7 || row==7 && col==7) {
		      System.out.print("  ");
		     }
		     else
		   
		    System.out.print("* ");
		    }
		    else
		     System.out.print("  ");
		   }
		   System.out.println();
		   
		  }
		  
		  
		 }

		 private void pattern3() {
		  for(int row=1;row<=7;row++) {
		   for (int col=1;col<=7;col++) {
		    if(row==1 || col==1 ||row==7)
		    {
		     if(row==1&&col==1 || row==7 && col==1) {
		      System.out.print("  ");
		      
		     }
		    System.out.print("* ");
		    }
		    else
		     System.out.print("  ");
		   }
		   System.out.println();
		   
		  }
		  
		 }

		 private void patten2() {

		  for(int row=1;row<=7;row++) {
		  for (int col=1;col<=7;col++) {
		   if(row==1) {
		   System.out.print("* ");
		   }
		   else {
		    if(col!=4)
		    System.out.print("  " );
		    else
		     System.out.print("* ");
		   }
		  }
		  System.out.println();
		  
		 }
		  
		 }
		 

		 private void pattern1() {
		  
		  for(int row=1;row<=7;row++) {
		  for (int col=1;col<=7;col++) {
		   System.out.print("* ");
		  }
		  System.out.println();
		  
		 }

		 }
		
	

	}
	
