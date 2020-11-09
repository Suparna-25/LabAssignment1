import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
   String string1;
   String string2;
   String operator;
  public Activity(String string1,String string2,String operator)
  {
    this.string1=string1;
    this.string2=string2;
    this.operator=operator;
  }  
  public void setString1(String string1)
  {
    this.string1=string1;
  }
  public String getString1()
  {
    return string1;
  }
   public void setString2(String string2)
  {
    this.string2=string2;
  }
  public String getString2()
  {
    return string2;
  }
   public void setOperator(String operator)
  {
    this.operator=operator;
  }
  public String getOperator()
  {
    return operator;
  }


}



public class Source {
  
  public static String handleException(Activity a){
    String msg=null;
        try{
          
            if(a.getString1()==null||a.getString2()==null)
            throw new NullPointerException("Null values found");
             else if(a.getOperator()!="+" && a.getOperator()!="-")
             throw new Exception(a.getOperator());
             else
              msg="No Exception Found";

    }
    catch(NullPointerException e)
    {
      msg=e.getMessage();
    }
    catch(Exception e)
    {
      msg=e.getMessage();
    }
    return msg;
  }
  public static String doOperation(Activity a)
  {
      String operations=a.getOperator();
      String result=null;
      switch(operations)
     {
   case "+": result=a.getString1()+a.getString2();

              break;
 case "-": result= a.string1.replaceAll(a.string2,"");  
           
              break;
    
      }
      return result;

  }
	public static void main(String args[] ) throws Exception {
    Activity a=new Activity("helloworld","world","-");
    String s= handleException(a);
    System.out.println(s);
    String s1= doOperation(a);
    System.out.println(s1);

    
	}
}