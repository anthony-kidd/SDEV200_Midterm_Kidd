// Author: Anthony Kidd
// Date of Last Revision: 02/14/2024
// Purpose: Create an NFL team roster
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.ArrayList; TODO
public class Main {
	
	private void mainMenu(){
		
		System.out.println("Menu:\n\t1: Add Player"
							  + "\n\t2: Print list of players"
							  + "\n\t3: Number of players"
							  + "\n\t4: EXIT");
	} // end mainMenu()
	
	private void playerCreatorMenu() {
		System.out.println("Please choose from the following positions: \n\n\t"
						 + "0: Main Menu\n\n"
						 + "Offense:\n\t"
							 + "1: Quarter Back\n\t"
							 + "2: Wide Receiver\n\t"
							 + "3: Tight End\n\t"
							 + "4: Running Back\n\t"
							 + "5: Offensive Lineman\n\n"
						 + "Defense:\n\t"
						 	 + "6: Defensive Lineman\n\t"
						 	 + "7: Linebacker\n\t"
						 	 + "8: Defensive Back\n\t"
						 	 + "9: Safety\n\n"
				 	 	 + "Special Teams:\n\t"
				 	 	 	 + "10: Kicker\n\t"
				 	 	 	 + "11: Punter\n");
	}
	
	
	public static void main(String[] args) {
		//ArrayList<String> Players= new ArrayList<>(); TODO
		Main main = new Main();
		
		Scanner in = new Scanner(System.in);
		int option = 0;
		do {
			main.mainMenu();
			try {
				option = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Please enter the number for one of the listed options");
				in.next();
			}
			
			switch (option) {
				case 1: {
					System.out.println("You selected: Add Player");
					main.playerCreatorMenu();
					break;
				} // end case 1 TODO
				
				case 2: {
					System.out.println("You selected: Print list of players");
					break;
				} // end case 2 TODO
				
				case 3: {
					System.out.println("You selected: Number of players");
					break;
				} // end case 3 TODO
				
				case 4: {
					System.out.println("End of program.");
					System.exit(1); //exit
					break;
				} // end case 4 TODO
		
			} // end switch
			
		} // end do
		while(option != 4);
		in.close();
	} // end main method

} // end class