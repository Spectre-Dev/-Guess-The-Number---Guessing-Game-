/*
 *GuessApp.java
 *@author:Rich Mangan
 *Date: 25/10/2013
 *BSHC1B
 */
 import javax.swing.JOptionPane;
	 public class GuessApp{
	 public static void main(String []args){
	//declare variables
	int number, secret;
	String message;
	//Declare objects
	Guess myGuess;
	//create objects
	myGuess = new Guess();
	//user input
	number = Integer.parseInt(JOptionPane.showInputDialog(null ,"Enter a number between 1-10"));
		 myGuess.setNumber(number);
	//compute
	myGuess.compute();
	//get method
	message = myGuess.getMessage();
	JOptionPane.showMessageDialog(null ,("")+message);
	secret = myGuess.getSecret();
	JOptionPane.showMessageDialog(null ,("The secret number was ")+ secret );

	}
}