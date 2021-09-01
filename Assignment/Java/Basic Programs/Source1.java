import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class MyException extends Exception
{
    MyException(String data){
         super(data);  
    }

}

public class Source1 {
     public String checkName(String firstName,String lastName)
     { 
         try {
        if (firstName=="" || lastName=="") 
        {
         throw new MyException("it is user defined exception");
        }
         }catch (Exception e){
             System.out.println(e);
         }
           return firstName+lastName; 
           
     }
	public static void main(String args[] ) throws Exception {
	    Source s=new Source();
	    try{
	        
	        s.checkName("Alan","Hasley");
	        
	       } catch(Exception e)
        {
            System.out.println(e);
        }
	    }
		

}