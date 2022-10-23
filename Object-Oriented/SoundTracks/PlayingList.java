/*
 *אבשלום אלמו - 313233827
 *אלון גלאי - 203204029
 */


import java.util.ArrayList;

public class PlayingList {

	private String  PlayingList; 
	private ArrayList<SoundTRack> soundTracks = new ArrayList<SoundTRack>();
	
	double totalPrice = 0 ; 
	double totalDuration = 0 ; 

	
	public PlayingList(String PlayingList) {
		this.PlayingList = PlayingList;
	}
	
	public void addSoundTrack(SoundTRack st) {
		soundTracks.add(st);
		
	}
	
	public double totalPrice(){
		int i = 0;
		for (SoundTRack Track: soundTracks) {
			i++; 
			if(i  < 5 ){
				totalPrice = totalPrice + Track.getPrice() ;
		        
		      }else if (i > 5){
					totalPrice = (totalPrice/2) + Track.getPrice() ;
					
		      }		
		}
		return 	totalPrice; 
	}

	public double totalDuration() {
		
		for (SoundTRack Track: soundTracks) { 
			totalDuration=totalDuration+ Track.getDuration();
		}
		return totalDuration; 
		
		
	}


	
	public String toString() {
		
		 String msg =String.format("Playing list name : %s \n", PlayingList);
		 msg +="-----------------------------------------\n"  ;
		 for (int i =0 ; i < soundTracks.size()  ; i++  ){
				msg += soundTracks.toString() +"\n";
			
		 }

		msg +="-----------------------------------------\n"  ;
		msg += String.format("Number of sound tracks :  %s \n " ,   soundTracks.size() ); ;
		msg += String.format("Total duration :   %.2f      \n " ,   totalDuration()); ;
		msg += String.format("Total price :      %.2f         " ,    totalPrice()); ;
		
		return msg;
	}

	
	
}
