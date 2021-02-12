package java15;

import javax.swing.JOptionPane;
// the library we need to add to the project before we can use JOptionpane.

public class resultt {
	//Every executable Java program consists of a class.
	
	public static void main (String[] args) {
		//main is a method which is a named group of statements
		
 String input = JOptionPane.showInputDialog("Please  enter your name");
 //JOptionpane opens a window to get information from the user or to inform the user.
 
 System.out.println(input);
 //Prints the given message as output.
  
 double value1 =Double.parseDouble(JOptionPane.showInputDialog("Enter your height: (for example;1.75cm )"));
 //Parsing is to read the value of one object to convert it to another.
 
 double value2= Double.parseDouble(JOptionPane.showInputDialog("Enter your weight: (for example;58.5kg )" ));
 // the command we use while receiving data from the user.
 
 double bmi=value2/(value1*value1);
 
 int  result;
 
 //
 
 if(bmi<16)  
 result =1 ;  
 
 else if( bmi>=16 && bmi<=17) 
 result =2;   
 
 else if(bmi>17 && bmi<=18.5) 
 result= 3;
 
 else if(bmi>18.5 && bmi<=25) 
result=4;
 
 else if( bmi>25 && bmi<=30) 
result=5;
 
 else if( bmi>30 && bmi<=35) 
result=6;
 
 else if(bmi>35 && bmi<=40 ) 
 result=7;
 
 else 
result=8;
 
 
	 System.out.println(bmi);
	 
	 switch(result) {
	 case 1:;
	 JOptionPane.showMessageDialog(null,input + "\tyour result is: Severe Thinnes" );
	 //the command we use while sending information to the screen is;JOptionpane.showMessageDialog();
	 break;
	 case 2:;
	 JOptionPane.showMessageDialog(null,input + "\tyour result is: Mild Thinnes");
	 break;
	 case 3:;
	 JOptionPane.showMessageDialog(null,input + "\tyour result is: Moderate Thinnes");
	 break;
	 case 4:;
	 JOptionPane.showMessageDialog(null,input + "\tyour result is: Normal");
	 break;
	 case 5:;
	 JOptionPane.showMessageDialog(null,input + "\tyour result  is:Overweight");
	 break;
	 case 6:;
	 JOptionPane.showMessageDialog(null,input + "\tyour result is: Obese Class 1" );
	 break;
	 case 7:;
	 JOptionPane.showMessageDialog(null,input + "\tyour result is: Obese Class 2");
	 break;
	 case 8:;
	 JOptionPane.showMessageDialog(null,input+ "\tyour result is: Obese Class 3");
	 break;
	 default:
	break;
 }
 

		    }
		
}


