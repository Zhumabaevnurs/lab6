import javax.swing.*;
/**
 * 
 * @author Nursultan Zhumabaev
 * @version 1
 * @lab 11E
 * @description: check if the user input is in the word array or not
 * 
 */

public class Lab6Program1 {
	static int counter = 0; // used to count the number of lines /static means available for all class
	public static void main(String[] args) {

		int[] wordArray=inputFromFile(args[0]); //args[0] represent s the file name lab6input.txt
		
		
		//Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "sum: "+ sum(wordArray, counter)+" and the average of array: "+average(wordArray, counter));
		}//main 
	
	/**
	 * use TextFileInput class to read from file and fill in the array
	 * @param fileName: the input file, lab6input.txt
	 * @return return the filled in array
	 */
	
	public static int[] inputFromFile(String fileName) {
		//create an object of TextFileInput by calling the constructor 
		TextFileInput tfi= new TextFileInput(fileName);
		String line=tfi.readLine(); //return the first line
		int[] temp = new int[20];
		//int i=0;
		//loop
		while(line!=null) { // keep reading from the file until the end
			temp[counter++]=Integer.parseInt(line);//counter is used to keep track of the actual number of values
			line=tfi.readLine(); //Read the next line
		}
		return temp;
	}
	
	public static int sum(int [] myArray, int myArraySize) {
		int sum=0;
		for(int i=0; i<myArraySize; i++) {
			sum+=myArray[i];
		}
		return sum;
	}

	public static double average(int[] myArray, int myArraySize) {
		return sum(myArray, myArraySize)/(double)myArraySize;
	}
} // class Lab4 