/*
 *GuessApp.java
 *@author:Rich Mangan
 *Date: 25/10/2013
 *BSHC1B
 */
 public class Guess{
	 //declare variables
	private int number;
	private int secret;
	private String message;

		public Guess(){
		number = 0;
		message = new String();
		secret = 1 + (int)(Math.random() * 10);
	}
	public void setNumber(int number){
	this.number = number;
	}
	//Compute method
	public void compute(){
			 if(number == secret){message = "You Guessed Correctly!";}
		else if(number > secret && number <11){message = "You guessed too high, sorry!";}
		else if(number < secret && number >0){message = "you guessed to low, sorry!";}
		else{message = "That number is not between 1 and 10";}
	}
	public String getMessage(){
		return message;
	}
	public int getSecret(){
		return secret;
	}
}

