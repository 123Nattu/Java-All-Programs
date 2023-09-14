package loops;
import java.util.Scanner;


public class TwoDimensionalArray {


	 public static void main(String[] args) {
	  TwoDimensionalArray ad = new TwoDimensionalArray();
	  //ad.demo1();
	 // ad.demo2();//Jagged Array - ARgged Array
	 // ad.demo3();//Jagged Array - ARgged Array - Nested loop demo
	 // ad.demo4();//addition of two matrix
	//  ad.demo5();//
	 // ad.demo6();//total of diagonal value
	  ad.demo7();//spiral matrix
	 }


	 private void demo7() {
		//Spiral Matrix: 

		  int[][] a = new int[4][4];
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"  ");
		    }
		    System.out.println();
		  } 
		  
		  int no = 1; 
		  int minRow=0, minCol=0, maxCol=3, maxRow=3; 
		  while(no<=16)
		  {
		  
		  for(int col=minCol; col<=maxCol; col++)
		  {
		    a[minRow][col] = no; no++; 
		  }
		  minRow++;
		  // 5 6 7 
		  for(int row=minRow; row<=maxRow; row++)
		  {
		    a[row][maxCol] = no; no++; 
		  }
		  maxCol--; 
		  
		  //8 9 10
		  for(int col=maxCol; col>=minCol; col--)
		  {
		    a[maxRow][col] = no; no++; 
		  }
		  maxRow--; 
		  
		  // 11 12
		  for(int row=maxRow;row>=minRow; row--)
		  {
		    a[row][minCol] = no; no++; 
		  }
		  minCol++; 
		  }
		  
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		  }		
	}


	private void demo6() {
		int[][]	 a= {{10,20,30},{40,50,60},{70,80,90}};
		int total=0;
		for(int row=0; row<a.length;row++) {
			for(int col=0; col<a[row].length; col++){
				if(row+col==2)
					total+=a[row][col];
			}
		}
		System.out.println(total);
	}


	private void demo5() {
		int [][]Marks={{50,60,45,80,90},{60,78,35,76,87}};
		int total=0;
		int row=0;
		while(row<Marks.length) {
			for(int col=0;col<Marks[row].length;col++) {
				total=total+Marks[row][col];
			}
			System.out.print(total+" ");
			row++;
			total=0;
		}
		
		
	}


	private void demo4() {
		int[][] a = {{10,20},{30,40}};
		int[][] b = {{40,30},{20,10}};
		int[][] c = new int[2][2];
		for(int row =0;row<2;row++) {
			for(int col=0; col<2; col++) {
				c[row][col] = a[row][col] + b[row][col];
				System.out.print(c[row][col]+" ");
			}
			System.out.println();
		}
		}


	private void demo3() {
	  //Jagged Array - ARgged Array
	    Scanner sc= new Scanner(System.in);
	    
	    int[][] player = new int[2][];
	    System.out.println("No of Player: "+player.length);
	    
	    
	    
	   // player[0]=new int[4];
	    for(int play=0;play>player.length;play++)
	    {
	     int total=0;
	    for(int match =0; match<player[play].length;match++)
	    {
	     System.out.println("Enter Scores");
	     player[0][match]=sc.nextInt();
	     total+=player[0][match];
	    }
	    System.out.println("Total Run "+total);
	    System.out.println("Avg"+total/player[0].length);
	    }
	    
	  
	 }

	 private void demo2() {
	  //Jagged Array - ARgged Array
	  Scanner sc= new Scanner(System.in);
	  
	  int[][] player = new int[2][];
	  System.out.println("No of Player: "+player.length);
	  
	  
	  //palyer 1
	  int total=0;
	  player[0]=new int[4];
	  for(int match =0; match<player[0].length;match++)
	  {
	   System.out.println("Enter Scores");
	   player[0][match]=sc.nextInt();
	   total+=player[0][match];
	  }
	  System.out.println("Total Run "+total);
	  System.out.println("Avg"+total/player[0].length);
	  
	  //player 2
	  player[1]=new int[3];
	  total=0;
	  for(int match =0; match<player[1].length;match++)
	  {
	   System.out.println("Enter Scores");
	   player[1][match]=sc.nextInt();
	   total+=player[1][match];
	  }
	  System.out.println("Total Run "+total);
	  System.out.println("Avg"+total/player[0].length);
	  
	 }

	 private void demo1() {
	  int [][] scores = {{65,35,120,80},{35,68,110,90}};
	  int player = 0;
	  while(player<2) {
	  for(int match=0;match<4;match++) {
	   System.out.println(scores[player][match]);
	  }
	  System.out.println();
	  player++;
	  }
	 }

}
