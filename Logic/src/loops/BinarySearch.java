package loops;

public class BinarySearch {

 public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();
  //bs.learn_1();
  bs.learn_2();

 }

 private void learn_2() {
  int a[]= {1,2,3,4,5};
  int search=2,min=0,max=a.length-1;
  while(true)
  {
   int mid=(min+max)/2;
   if(search==a[mid])
   {
    System.out.println(mid);
    break;
   }
   else if(min>max)
   {
    System.out.println("Not found");
    break;
   }
   else if(min>a[mid])
   {
    min=mid+1;
   }
   else
   {
    max=mid-1;
   }
  }
  
 }

 private void learn_1() {
  int [] ar= {10,23,32,41,55,65,87,89,90};
  int search = 100;
  int min=0,max=ar.length-1;//8
  while(min<=max)
  {
   int mid=(min+max)/2;//4//7//8
   if(search==ar[mid])//100==55//100==90
   {
    System.out.println(search+" Search is present at "+mid+" index");
    break;
   }
   else if(search>ar[mid])//100>55//100>89//100>90
   {
    min=mid+1;//5//8
   }
   else if(search<ar[mid])
   {
    max=mid-1;
   }
   
  }
  
  if(min>max)
  {
   System.out.println("Search is not Present");
  }
  
  
 }

}