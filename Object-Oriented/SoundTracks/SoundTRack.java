

public class SoundTRack {
	
	
	private String  title; 
	private String  artist; 
	private String  composer; 
	double duration;
	double price = 0 ; 
	
	public SoundTRack (String  title , String  artist, String  composer, double duration) {
		this.title = title;
		this.artist = artist;
		this.composer = composer;
		this.duration = duration;		
	}
	public double getPrice() {
		if(duration > 5) {
			price = 3 + 0.5*(duration - 5); 
			return price;
		}else { 
			return price = 3 ;		
       	}
	}
	
    public double getDuration() {
		return duration;
	}
    
	@Override
	
	public String toString() {
		return String.format("SoundTRack [ title= %s, artist= %s, composer= %s, duration= %.2f, price= %.2f]", title, artist,
				composer, duration, getPrice());
	}
	
	
	

	
	
	
}
