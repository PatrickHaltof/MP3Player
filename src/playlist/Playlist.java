package playlist;

import java.util.HashMap;

public class Playlist {
	private HashMap<Integer, Track> playlist = new HashMap<Integer, Track>();
	private int trackCounter = 0;
	private String playlistName;
	private int nextSong = 1;
	
	private Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	private Playlist(String playlistName, boolean loadAll) {
		this.playlistName = playlistName;
		if(loadAll) {
			
		}
	}
	
	public void addTrack(Track song) {
		this.playlist.put(this.trackCounter, song);
	}
	
	public String getPlaylistName() {
		return playlistName;
	}
	
	public HashMap<Integer, Track> getPlaylist() {
		return playlist;
	}
	
	public int getNextSong() {
		return nextSong;
	}
	
	public void setNextSong(int nextSong) {
		this.nextSong = nextSong;
	}
	
	//Ermöglche ggf. später das Löschen von Tracks von der Playlist
	/*public void removeTrack(int trackNummer) {
		this.playlist.remove(trackNummer);
		//Alle nachträglichen Songs rücken einen Schritt zurück
		this.playlist.forEach(arg0);
	}*/
}
