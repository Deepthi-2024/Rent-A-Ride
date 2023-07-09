package Rent_a_Ride;

public class HatchBack {
    String name4="B";
    double rat4=4.3;
    int distfrom4=1000;
    
    String name5="E";
    double rat5=4.7;
    int distfrom5=430;
    public void print() {
    if(rat4>=4.0 && rat5>=4.0){
   	 if(distfrom4<distfrom5) {
   		 System.out.println("driver "+name4+" is get you to the destination");
   	 }
   	 else {
   		 System.out.println("driver "+name5+" is get you to the destination");
   	 }
      }
    }
}
