package com.easyparking.myParking.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.Logger;

import com.easyparking.myParking.commands.*;
import com.easyparking.myParking.parking.Parking;




public class Main {
	
	final static Logger logger = Logger.getLogger(Main.class);
	
	private Set<Command> commands=new HashSet<Command>();
	
	public Main(){
		commands.add(new Add());
		commands.add(new Remove());
	}
	
	public Command findCommandByName(String name){
		Command findCommand=null;
		for (Command com:commands){
			if(com.getName().equals(name)){
				findCommand=com;
			}
		}
		return findCommand;
	}

	public static void main(String[] args) {
		
		Main mainobject = new Main ();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to this wonderful parking managing system!");
		boolean error = true; 
		int numOfPlaces = 0;
		do{
			System.out.println("Please, how many places does your parking have?");
			try {
				numOfPlaces = Integer.parseInt(sc.nextLine());
				error = false;
			} catch (Exception e){
				System.out.println("This is not a valid number of places, please enter an integer.");
				logger.error("Invalid number of parking places entered.", e);
			}
		} while(error);
		
		Parking parking = new Parking(numOfPlaces);
		System.out.println("Thank You! Your parking has been set. Vehicules can know come in and out (use the command add and remove). ");
		
		do{
			String response=sc.nextLine();
			String[] strVect = response.split(" ");
			Command com = null;
			
			com = mainobject.findCommandByName(strVect[0]);
			if(com==null){
				System.out.println("The command  " + strVect[0] + " does not exist, please try again!");
			}
			else {
				int n=strVect.length;
				String[] argVect = Arrays.copyOfRange(strVect,1,n); //creation of an array with the arguments for the command
				String result = com.run(argVect, parking);
				System.out.println(result);
			}
		} while(sc.hasNextLine());
		
	}
}
