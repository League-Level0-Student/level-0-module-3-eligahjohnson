
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
	    String momsBirthday = "feburary 8";
	    
		String dadsBirthday = "september 25";
		String myBirthday ="November 29";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String fart = JOptionPane.showInputDialog("Chose a birthday between mom,dad or my ");
		// 3. Print out what the user typed
		System.out.println(fart);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(fart.equals("mom")) { System.out.println("feburary8");
			
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(fart.equals("dad")) {
			System.out.println("september 25");
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(fart.equals("my")) {
			System.out.println("November 29");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {	System.out.println("your very dumb none things you wrote were right");
			
		}
		
		}
}
	
