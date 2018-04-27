package gds;

import java.util.Scanner;

public class idade {

public static void main(String[]args){
	  Scanner le = new Scanner(System.in);
	  System.out.println("idade 1:");
	 int id1 = le.nextInt();
	 System.out.println("idade 2:");
	 int id2 = le.nextInt();
	 System.out.println("idade 3:");
	 int id3 = le.nextInt();
	 
	if(id1 > id2){
		if(id1 > id3){
			System.out.println("idade 1 maior");
		}
	}if(id2 > id1){
		if(id2 > id3){
			System.out.println("idade 2 maior");
		}
	}if(id3 > id1){
		if(id3 > id2){
			System.out.println("idade 3 maior");
		}
	}
	
}
}
