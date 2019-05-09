import java.util.Scanner;
package finalproj;

public class textAdv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Celebrity Mansion! Today, we have a murder mystery in our hands. We need you to help us figure out whodunnit. What's your name detective?" );
		System.out.println("___________________________________________________________________________________________________");
		System.out.print("Please enter your name:");
		String detectiveName = input.nextLine();
		
		user detective = new user();
		detective.setName(detectiveName);
		
		System.out.println("___________________________________________________________________________________________________");

		System.out.println("OJ Simpson: Hey there, " + detective + "! Thank you for joining us. Welcome to the ballroom of Celebrity Mansion! As you can see, we have a poor unidentified victim in front of you here, and we need YOU to figure out who killed her.");
		System.out.println("To find out whodunit, you're going to have to navigate through the seven other rooms in the building. Each room will contain a clue so make sure to inspect EVERYTHING. Once you have collected all clues, we'll need you to identify who our killer is, but be careful - the killer may still be lurking around the house!");
		
		System.out.println("___________________________________________________________________________________________________");

		baseAdv element = new baseAdv();
		element.rooms();
		String nav;
		int x;
		
		while(game.end==false) {
			nav="";
			x=0;
			System.out.println("Which way would you like to go?");
			nav=input.nextLine();
			if (nav.equals("Forward")) {
				x=1;
			} else if (nav.equals("Backward")) {
				x=2;
			} else if (nav.equals("Left")) {
				x=3;
			} else if (nav.equals("Right")) {
				x=4;
			}
			
			
		}
		
	}

}
