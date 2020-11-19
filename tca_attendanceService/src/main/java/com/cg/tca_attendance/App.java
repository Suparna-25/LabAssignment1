package com.cg.tca_attendance;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.tca_attendance.entities.*;
import com.cg.tca_attendance.repository.*;
import com.cg.tca_attendance.services.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
      IEmployeeService service=new EmployeeService();
      IAttendanceDetailsService aservice=new AttendanceDetailsService();
      
      
      
    	   
    	  
            int i=0;
            while(i==0)
            {	 AttendanceDetails attendance=new AttendanceDetails();
            	 Employees emp=new Employees();
            	System.out.println("Enter your employee id");
                       	Long id=sc.nextLong();
            	        service.validateEmployeeById(id);
             
            	       
                 	
            		
            		    List<Employees> emps = service.viewEmployeesUnderSupervisior(id);
            		    
            		  for(Employees e : emps) {
            			  System.out.println(e);
            		  }
            		  System.out.println("Enter the employee's id you want to update");
            		  long eid=sc.nextInt();
            		  List<AttendanceDetails> atti=service.viewAttendanceByEmpId(eid);
         			   for(AttendanceDetails a:atti)
         			   {
         				  System.out.println(a.toString());
         				  System.out.println("Update status by");
         				  String status=sc.next();
         				  aservice.updateAttendanceStatus(a, status);
         				   System.out.println(a.toString());
         				   
         			   }
            		  //  flag=true;
            	      //}
            	  
            	if(emps.isEmpty()){

            		System.out.println("1.Add Attendance\n 2.View Attendance");
            		System.out.println("Enter your choice");
            		int choice=sc.nextInt();
            		switch(choice)
            		{
                  		case 1:
                  			System.out.println("Provide attendance details");
                  			System.out.println("Enter the date");
                  			String date=sc.next();
                    		attendance.setDate(date);
                  			System.out.println("Enter the In time");
                  			String inTime=sc.next();
                 	        attendance.setInTime(inTime);
                 	        System.out.println("Enter the Out time");
                 	        String outTime=sc.next();
                	        attendance.setOutTime(outTime);
                	        System.out.println("1. Forgot Card\n 2. Client Location \n 3. Working From Home\n 4.Business Travel \n 5.Missed Both Swipes");
                	        System.out.println("Choose the attendance type");
                	        int choose=sc.nextInt();
                	        sc.nextLine();
                	        aservice.setAttendanceType(choose,attendance);
                	        System.out.println("Enter the reason for attendance");
                	        String reason=sc.nextLine();
                	        attendance.setReason(reason);
                	        attendance.setStatus("Pending");
                	        attendance.setEmployee(emp);
                	        aservice.addAttendanceDetails(attendance);
              	        break;
                  		case 2: 
                  			   List<AttendanceDetails> att=service.viewAttendanceByEmpId(id);
                  			   for(AttendanceDetails a:att)
                  			   {
                  				   System.out.println(a.getDate());
                  				   
                  			   }
                  		 break;
                  	
           
                  	 
                  				
                  		
            		}
            	}
            	
            }
      
       
       
       
    }
}
