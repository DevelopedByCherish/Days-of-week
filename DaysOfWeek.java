/*
* Cherish Shanks
* IT145
* Final Programming Problem
* June 5,2016
 */

//Import the scanner class
import java.util.*;

public class DaysOfWeek {
	 // instantiate standard input object
	   static Scanner keyboard = new Scanner(System.in);
	           // make days = numbers
	        final static int SUN = 0;
	        final static int MON = 1;
	        final static int TUE = 2;
	        final static int WED = 3;
	        final static int THU = 4;
	        final static int FRI = 5;
	        final static int SAT = 6;
	                         

	        public int theDay; 

	        public DaysOfWeek (int theDay)
	       {this.theDay = theDay;}

	        public void setDay(int theDay)
	        {this.theDay = theDay;}        


	            // return the next day
	        public int nextDay(int theDay)
	        {
	            if (theDay == SAT)
	            {return SUN;}

	            else {theDay = (theDay + 1) % 7;}            
	            return theDay;           
	        }                  
	            // return the nexNext day
	 public int nextNextDay(int theDay)
	        {
	            if (theDay == SAT)
	            {return MON;}

	            else {theDay = (theDay + 2) % 7;}            
	            return theDay;           
	        }                  

	           // return the previous day
	        public int preDay(int theDay) 
	        {
	            if (theDay == 0)
	            {return SAT;}

	            else {theDay = (theDay - 1) % 7;}        
	            return theDay;           
	        }       

	        public int plusDay(int theDay, int theDays) 
	        {return ((theDay + theDays) % 7);}
	        
	        public String toString()        
	        {
	            switch (this.theDay) 
	               {
	                  case SUN:
	                        return "Sunday";
	                  case MON:
	                        return "Monday";
	                  case TUE:
	                        return "Tuesday";
	                  case WED:
	                        return "Wednesday";
	                  case THU:
	                        return "Thursday";
	                  case FRI:
	                        return "Friday";
	                  case SAT:
	                        return "Saturday";
	                }
	                  return "";
	        }    

	                  //Convert string to to integer
	          public int convertToInteger (String x)
	               {
	                   int testDayInt = 0;
	                   switch(x)
	                   {
	                       case "SUN":
	                           testDayInt = 0;
	                           return testDayInt;
	                          
	                       case "MON":
	                           testDayInt = 1;
	                           return testDayInt;
	                         
	                       case "TUE":
	                           testDayInt = 2;
	                           return testDayInt;
	                         
	                       case "WED":
	                           testDayInt = 3;
	                           return testDayInt;
	                         
	                       case "THU":
	                           testDayInt = 4;
	                           return testDayInt;
	                          
	                       case "FRI":
	                           testDayInt = 5;
	                           return testDayInt;
	                         
	                        case "SAT":
	                           testDayInt = 6;
	                           return testDayInt;
	 
	                           
	                        default: 
	                        System.out.println("I dont know what day it is!");
	                           break;
	                       } 
	                       return testDayInt;
	}


	               //Call Main method
	        public static void main(String[] args) 
	        
	        
	        {
	               DaysOfWeek ourDay = new DaysOfWeek(SUN);  
	               
	  
	               String testDay;
	               int numDay;
	              
	                  //Ask User for the Day!
	               System.out.println("Enter day to set your day (Example SUN,MON,TUE,WED,THU,FRI or SAT: ");
	               
	               testDay = keyboard.nextLine();
	               
	                System.out.println();  
	                
	                int testDayInt;
	                
	                testDayInt = ourDay.convertToInteger(testDay);
	                       // Print current Day
	                System.out.print("The current day is: " + testDay);                
	                System.out.println();
	                
	                       //Print previous day
	                ourDay.setDay(ourDay.preDay(testDayInt));
	                System.out.print("The previous day is: " + ourDay);                               
	                System.out.println();
	                
	                       //Print next day
	                ourDay.setDay(ourDay.nextDay(testDayInt));               
	                ourDay.setDay(ourDay.nextDay(testDayInt));
	                System.out.print("The next day is: " + ourDay);              
	                System.out.println();
	                  
	                       //Print next next Day
	                ourDay.setDay(ourDay.nextNextDay(testDayInt));
	                System.out.print("The next day again is: " + ourDay);              
	                System.out.println(); 
	                
	                      //Ask user for the number of days they want to add to their current day
	                System.out.println("Enter Enter the number of days past: ");
	                numDay = keyboard.nextInt();   
	                
	                      //Print their new day               
	                ourDay.setDay(ourDay.plusDay(numDay, testDayInt));
	                System.out.print("Your New Day is: " + ourDay);               
	                System.out.println();

	       
	        }       
	}
