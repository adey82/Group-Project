package finalproj;

public class baseAdv {
	
	/*
	 * 1 - forward
	 * 2 - backward
	 * 3 - left
	 * 4 - right
	 */
	
	int wya = 0;
	
	//rooms
	public void rooms() {
		room[0] = "Ballroom";
		room[1] = "Dining Room";
		room[2] = "Conservatory";
		room[3] = "Kitchen";
		room[4] = "Lounge";
		room[5] = "Billiard Room";
		room[6] = "Library";
		room[7] = "Study";
				
	}
	
	//clues
	
	boolean clueOne = false; //Hatchet
	boolean clueTwo = false; //Bloody Glove
	boolean	clueThree = false; //Bruno Magli Shoe
	boolean clueFour = false; //Football
	boolean clueFive = false; //Car Keys
	boolean clueSix = false; //Underwear
	boolean clueSeven = false; //Microphone
	boolean allclues = false;
	
	String input = nextLine();
	
	public void navigate(int a) {
		if (wya==0) { //Ballroom
			
			if (a==0) {
				if(allclues = false) {
					System.out.println("OJ Simpson: Still haven't found all the clues yet, have ya? Keep looking, " + player + ", and hurry it up. You never know who's following ya.");
				} else {
					System.out.println("OJ Simpson: Oh, I see you've got all the clues there, buddy. Considering all of the clues you've collected, who do YOU think is the murderer?");
					if () {
						
					}
				}
			}
			
			if (a==1) {
				wya=1;
				System.out.println("Michael Vick: Hey," + player + "! Welcome to the Dining Room. I'm trying to enjoy my lasagna here, but here. I found this outside Celebrity Mansion before going on my run.\n Clue retrieved. You have just collected a hatchet!");
				} else {
				System.out.println("Michael Vick: Back in the dining room? I already told you everything I know. Now get out of here!");
			}
		}
	}
}

