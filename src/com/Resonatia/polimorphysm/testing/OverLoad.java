package com.Resonatia.polimorphysm.testing;
 
public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi re =new Sbi();
          // re.rateOfIntrest();
           re.rateOfIntrest(4,5);

	}

}
    class Sbi{
    	
    	 void  rateOfIntrest(){
    		System.out.println("no intrest");  
    	  }
    	 void rateOfIntrest(int x , int y) {
    		 System.out.println(x+"and"+y);
    	 }
    }