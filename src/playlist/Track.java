package playlist;

import java.io.IOException;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class Track {
	private String trackName, trackPfad, trackDescription, trackAlias;
	
	private Track(String trackName, String trackPfad) {
		this.trackName = trackName;
		this.trackPfad = trackPfad;
		try {
			Mp3File mp3file = new Mp3File(trackPfad);
		} catch (UnsupportedTagException e) {
			e.printStackTrace();
		} catch (InvalidDataException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getTrackName() {
		return trackName;
	}
	
	public String getTrackPfad() {
		return trackPfad;
	}
}
