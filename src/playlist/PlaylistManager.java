package playlist;

import java.util.HashMap;

public class PlaylistManager {
	
	private HashMap<String, Playlist> playlistListe = new HashMap<String, Playlist>();
	private Playlist currentPlaylist = null;
	
	public Playlist getPlaylist(String name) {
		try {
			this.currentPlaylist = this.playlistListe.get(name);
			return this.playlistListe.get(name);
		} catch (NullPointerException e) {
			//Song nicht gefunden
			System.out.println("Song nicht gefunden.");
			return null;
		}
		
	}
	
	public Playlist getAllTracks() {
		return currentPlaylist;
	}
}
