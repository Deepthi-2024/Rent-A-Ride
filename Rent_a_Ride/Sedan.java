package Rent_a_Ride;

public class Sedan {
	  String name1="A";
	  double rat1=4;
	  int distfrom1=500;
	  
	  String name2="D";
	  double rat2=4.1;
	  int distfrom2=700;
     public void print(){
    	 if(rat1>=4.0 && rat2>=4.0){
    	 if(distfrom1<distfrom2) {
    		 System.out.println("driver "+name1+" is get you to the destination");
    	 }
    	 else {
    		 System.out.println("driver "+name2+" is get you to the destination");
    	 }
       }
     } 
}
