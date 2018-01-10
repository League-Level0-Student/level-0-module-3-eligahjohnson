
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Set;

public class RobotColorChooser {
	public static void main(String[] args) {
		  Robot frog =new Robot();
		  frog.penDown();
		  frog.setPenColor(Color.cyan);
		  frog.setSpeed(10);
		  
		  for (int i = 0; i <4; i++) {
			  frog.move(100);
			  frog.turn(90);
		}
		 JOptionPane.showInputDialog(null, "Chose a color");	  
		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)
  

	}
}
