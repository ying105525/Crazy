package test1;

import java.util.*;

class test1{
    static String[] months = {"January","February","March","Aprial","May","June"};
    
    public static void main(String args[]){
      Stack stk = new Stack();
      for(int i = 0;i<months.length;i++){
    	  stk.push(months[i]+" ");
      }
      System.out.println("stk="+stk);
      
      stk.addElement("The last line");
      System.out.println("poping elements:");
      while (!stk.empty()) {
		System.out.println(stk.pop());
		
	}
    }
    
}