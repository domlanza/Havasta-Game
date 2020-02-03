package agame2edit;

import java.util.Random;
import java.util.Scanner;

public class agame2 {

	public static void main(String args[]) {
		rules();
		toplay();
		
	}
	
	public static void rules() {
		System.out.println("                Hello!");
		System.out.println("Today we will be playing the game Havasta.");
		System.out.println();
		System.out.println("          The rules are simple:");
		System.out.println();
		System.out.println("1.You pick a character!");
		System.out.println();
		System.out.println("2.The CPU picks a character and they fight to the death!");
		System.out.println();
		System.out.println("3.In the event of a tie the CPU wins because the game would not "
				+ "be possible; without the machine!");
		System.out.println();
		System.out.println();
		System.out.println("      Here are how the players are ranked:");
		System.out.println();
		System.out.println("      Äpplaro beats Svartrå and Tunholmen");
		System.out.println("      Svartrå beats Tunholmen");
		System.out.println("      Tunholmen beats Godafton");
		System.out.println("      Godafton beats Äpplaro and Svartrå");
		System.out.println();
		System.out.println();
	}
	
	public static void toplay() {
		int gamecount = 0;
		int cpuwincount = 0;
		int pplwincount = 0;
		
		
		while(true) {
			
			Scanner in = new Scanner(System.in);
			System.out.println();
			System.out.println("Would you like to play?");
			System.out.println("If yes, simply type in 'y' or for no type in 'n': ");
			String requesttoplay = in.nextLine();
			System.out.println();	
			if(requesttoplay.equals("y")) {
				
					System.out.println("This is how many games you have played so far: "+ gamecount);	
					System.out.println("This is the current score between you and the CPU is");
					System.out.println("----------------------------------------------------");		
					System.out.println("CPU: " + cpuwincount + " Human: " + pplwincount);
					System.out.println();		

				
					int personchoice = game();
					choice(personchoice);
					int cpuchoice = CPUpick();
					choice(cpuchoice);
					
					
				
					
					//EQUATIONS FOR WINNER
					//Godafton > Applaro and Svatra
					//Tunholmen > Godafton
					//Svatra > Tunholmen
					//Applaro > Svatra and Tunholmen
					
					//tie first
					if(cpuchoice == personchoice) {
						System.out.println("Its a tie");
						cpuwincount++;
					}
					//Savtra > Tunholmen
					else if(cpuchoice == 1 && personchoice == 2) {
						System.out.println("Computer wins");
						cpuwincount++;
					}
					else if(cpuchoice == 2 && personchoice == 1) {
						System.out.println("Person wins");
						pplwincount++;
					//Godafton > Applaro and Svatra
					}
					else if(cpuchoice == 4 && personchoice == 1 ) {
						System.out.println("Computer wins");
						cpuwincount++;
					}
					else if(cpuchoice == 4 && personchoice == 3 ) {
						System.out.println("Computer wins");
						cpuwincount++;
					}
					else if(cpuchoice == 1 && personchoice == 3 ) {
						
						System.out.println("Person wins");
						pplwincount++;
					}
					else if(cpuchoice == 1 && personchoice == 4 ) {
						System.out.println("Person wins");
						pplwincount++;
					}
					//Tunholmen > Godafton
					else if(cpuchoice == 2 && personchoice == 4 ) {
						System.out.println("Computer win");
						cpuwincount++;
					}
					else if(cpuchoice == 4 && personchoice == 2 ) {
						System.out.println("Person wins");
						pplwincount++;
					}
					//Applaro > Svatra and Tunholmen
					else if(cpuchoice == 3 && personchoice == 1 ) {
						System.out.println("CPU wins");
						cpuwincount++;
					}
					else if(cpuchoice == 3 && personchoice == 2 ) {
						System.out.println("CPU wins");
						cpuwincount++;
					}else if(cpuchoice == 1 && personchoice == 3 ) {
						System.out.println("Person wins");
						pplwincount++;
					}else if(cpuchoice == 2 && personchoice == 3 ) {
						System.out.println("Person wins");
						pplwincount++;
					}
					else {
						System.out.println("How did you get here?");
					}

					gamecount++;
					}
				
			 	else if("n".equals(requesttoplay)) {
			 		System.out.println();
			 		System.out.println("This how many games you have played: "+ gamecount);
			 		System.out.println("Human Score: " + pplwincount + " CPU Score: " + cpuwincount);
			 		break;
			 	}	
			 else {
				System.out.println("I guess you can't even type or follow directions");
			}
		}
		
	}
	
	public static int game() {
		System.out.println("SELECT YOUR FIGHTER");
		System.out.println(" SELECTION");
		System.out.println("___________");
		System.out.println("");
		System.out.println(" 1  :  Svartrå");
		System.out.println(" 2  :  Tunholmen ");
		System.out.println(" 3  :  Äpplaro");
		System.out.println(" 4  :  Godafton");
		System.out.println("");
		System.out.println("Who will it be? ");
		System.out.println("");
		System.out.println("Please select one by typing in the number in front of their character name:");
		Scanner fighter = new Scanner(System.in);

		int selectedfighter = fighter.nextInt();
		
		System.out.println("You selected: " + selectedfighter);
		System.out.println();
		
		return selectedfighter;
		
		
	}
	
	public static int CPUpick() {
	
		System.out.println("The CPU SELECTED");
		System.out.println();

		Random rnd = new Random();
		
		int d1 = rnd.nextInt(4)+ 1;
		
		d1 = rnd.nextInt(4)+1;
		
		
		
		return d1;
		
	}

		public static int choice(int pick) {
		if(pick == 1) {
			System.out.println("    Svatra");
			System.out.println();

		}
		else if(pick == 2) {
			System.out.println("    Tunholmen");
			System.out.println();

		}
		else if(pick == 3) {
			System.out.println("    Applaro");
			System.out.println();

		}
		else{
			System.out.println("    Godafton");
			System.out.println();

		}
		
		int chickendinner = 0;
		return chickendinner;

	}
}



