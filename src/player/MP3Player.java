package player;

import de.hsrm.mi.eibo.simpleplayer.SimpleAudioPlayer;
import de.hsrm.mi.eibo.simpleplayer.SimpleMinim;
import playlist.Playlist;

/**
 * Shuffle und Repeat können zusammen aktiviert sein, in dem Fall wird beim nächsten Song Repeat wichtiger sein, 
 * also es wird solange der gleiche song abgespielt bis repeat ausgemacht wird -> shuffle ist wieder aktiv
 * @author phalt001
 *
 */
public class MP3Player {
	
	private SimpleMinim minim;
	private SimpleAudioPlayer audioPlayer;
	private Playlist currentPlaylist = null;
	//Shuffle spielt die Songs zufällig
	private boolean shuffle = false;
	//Repeat spielt den selben song nochmal
	private boolean repeat = false;
	
	MP3Player() {
		//Parameter true erlaubt das asynchrone spielen der Musik
		this.minim = new SimpleMinim(true);
	}
	
	public void play(String dateiName) {
		audioPlayer = minim.loadMP3File(dateiName);
	}
	
	public void play() {
		audioPlayer.play();
	}
	
	public void pause() {
		if(audioPlayer.isPlaying()) {
			audioPlayer.pause();
		}		
	}
	
	public void volume(float volume) {
		
		if(volume > 0 && volume < 1) {
			audioPlayer.setVolume(volume);
		} else {
			System.out.println("Keine korrekte Angabe.");
		}
	}
	
	//Setzt die Playlist
	public void setPlaylist(Playlist actPlaylist) {
		currentPlaylist = actPlaylist;
	}
	
	//überspringt den nächsten Song
	public void skip() {
		currentPlaylist.setNextSong(currentPlaylist.getNextSong()+1);
	}
	
	//Wie Skip, nur umgekehrt
	public void skipBack() {
		currentPlaylist.setNextSong(currentPlaylist.getNextSong()-1);
	}
	
	public void shuffle(boolean on) {
		this.shuffle = on;
	}
	
	public void repeat(boolean on) {
		this.repeat = on;
	}
	
}
