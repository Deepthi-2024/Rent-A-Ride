package Rent_a_Ride;
import java.util.Scanner;
public class Ride {
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Distance travelled: ");
	   Double distance=sc.nextDouble();
	   System.out.println("car required:");
	   String car=sc.next();
	   String[] carname= {"sedan","hatchback","seater5","sedan","hatchback"};
	   String[] driver= {"A","B","C","D","E"};
	   double[] rating= {4,4.3,4.8,4.1,4.7};
	   int[]    distfrom= {500,1000,200,700,430};
	   int charges=8;
	   System.out.println("List of Drivers with Details:");
	   System.out.println("driver | carname | rating | distfrom");
	   for(int i=0;i<5;i++) {
		   System.out.println(driver[i]+" | "+carname[i]+" | "+rating[i]+" | " +distfrom[i]);
	   }
	   System.out.println();
	   switch(car) {
	   case "sedan":
		   Sedan s1=new Sedan();
		   s1.print();
		   System.out.println("total charge: "+charges*distance);
		   break;
	  case "seater5" :
		  Seater5 s2= new Seater5();
		  s2.print();
		  System.out.println("total charge: "+charges*distance);
		  break;
	  case "hatchback":
		  HatchBack h1=new HatchBack();
		  h1.print();
		  System.out.println("total charge: "+charges*distance);
		  break;
	  case "5-seater":
		  System.out.println("ClassName does start will number so try 'seater5' as car name");
		  break;
	  default:
		  System.out.println("no driver present as per your request for the car");
	   }
   }
}