package player;

import de.hsrm.mi.prog.util.StaticScanner;

public class KeyboardController {

	private  MP3Player player = new MP3Player();

	private final String NAMEPLAY = "play";
	private final String NAMEPAUSE = "pause";
	private final String NAMEVOLUME = "volume";
	private final String NAMESKIP = "skip";
	private final String NAMESKIPBACK = "skipback";
	private final String NAMESHUFFLE = "shuffle";
	
	
	/**
	 * TODO: Methoden vervollständigen -> shuffle, repeat, setplaylist, 
	 */
	public  void start() {

		String eingabe;
		System.out.println("Bitte den ersten command eingeben.");
		// play 01 Bring Mich Nach Hause.mp3
		
		do {

			eingabe = StaticScanner.nextString();
			
			if (eingabe.contains(NAMEPLAY)) {

				if (eingabe.split(" ").length == 1) {
					// ist nur ein Wort
					player.play();
					System.out.println("WEITER");
				} else if (eingabe.split(" ").length >= 2) {
					player.play(eingabe.substring(5));
				} else {
					// Mehr als 2 Parameter, ungueltig

				}

			} else if (eingabe.contains(NAMEVOLUME)) {
				
				if (eingabe.split(" ").length == 0) {
					System.out.println("Fehlende Parameter für Lautstaerke");
					// ist nur ein Wort
					// player.play();

				} else if (eingabe.split(" ").length == 2) {
					String[] tmp;
					tmp = eingabe.split(" ");
					player.volume(Float.parseFloat(tmp[1]));

				} else {
					// Mehr als 2 Parameter, ungueltig

				}
			} else if (eingabe.contains(NAMESHUFFLE)) {
				
				if (eingabe.split(" ").length == 0) {
					System.out.println("abc");
					// ist nur ein Wort
					// player.play();

				} else if (eingabe.split(" ").length == 2) {
					String[] tmp;
					tmp = eingabe.split(" ");
					player.volume(Float.parseFloat(tmp[1]));

				} else {
					// Mehr als 2 Parameter, ungueltig

				}
			} else if (eingabe.equals(NAMEPAUSE)) {
				player.pause();
				
			} else if (eingabe.equals(NAMESKIP)) {
				player.skip();
				
			} else if (eingabe.equals(NAMESKIPBACK)) {
				player.skipBack();
				
			} else {
				System.out.println("4");
			}
			
			System.out.println("command eingegeben");

		} while (eingabe != "quit");

		System.out.println("MP3-Player wird beendet.");

	}

}
