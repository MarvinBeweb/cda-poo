package minuteur;

public class Minuteur {
	
	private int minute = 0;
	
	/**
	 * Accesseur
	 * @return
	 */
	public int getMinute() {
		return this.minute;
	}
	
	/**
	 * Mutateur
	 * @param nouvelleValeur
	 */
	public void setMinute(int nouvelleValeur) {
		if(nouvelleValeur > 59 || nouvelleValeur < 0) {
			this.minute = 0;
		}else {			
			this.minute = nouvelleValeur;
		}
	}
	
	/**
	 * Avancer d'une minute
	 */
	public void tic() {
		this.setMinute(minute + 1);
		System.out.println(this.minute + " min ");
	}

	/**
	 * Avancer de n minute
	 * @param n
	 */
	public void avancer(int n) { 
		for (int i = 0; i < n; i++) { 
			this.tic();
			} 
		}
}
