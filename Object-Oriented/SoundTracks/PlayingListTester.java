/*
 * PlayingListTester.java - testing classes SoundTrack and PlayingList
 */
public class PlayingListTester {

	public static void main(String[] args) {
		
		SoundTRack st1 = new SoundTRack("Furioso for Orchestra", "Nabatov, Simon", "Liebermann, Rolf", 8.34);
		SoundTRack st2 = new SoundTRack("Geigy Festival Concerto", "Grieder, Alfons", "Liebermann, Rolf", 12.1);
		SoundTRack st3 = new SoundTRack("Jazz Suite No. 2", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 20.25);
		SoundTRack st4 = new SoundTRack("March", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 3.08);
		SoundTRack st5 = new SoundTRack("Dance 1", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 3.04);
		SoundTRack st6 = new SoundTRack("Finale", "Yablonsky, Dmitry", "Shostakovich, Dmitry", 1.55);
		SoundTRack st7 = new SoundTRack("Rhapsody in Blue", "Robertson, David", "GERSHWIN, G", 17.36);
		SoundTRack st8 = new SoundTRack("Piano Concerto in F Major", "Robertson, David", "GERSHWIN, G", 33.33);
		
		PlayingList jazz = new PlayingList("Jazz");
		
		jazz.addSoundTrack(st1);
		jazz.addSoundTrack(st2);
		jazz.addSoundTrack(st3);
		
		System.out.printf("3 sound tracks are added to the playing list\n");
		System.out.printf("-----------------------------------------\n");
		System.out.print(jazz.toString() +"\n\n");
		
		jazz.addSoundTrack(st4);
		jazz.addSoundTrack(st5);
		jazz.addSoundTrack(st6);
		jazz.addSoundTrack(st7);
		jazz.addSoundTrack(st8);
		
		System.out.printf("5 more sound tracks are added to the playing list\n");
		System.out.printf("-----------------------------------------\n");
		System.out.print(jazz.toString() +"\n\n");
		

	}
}

