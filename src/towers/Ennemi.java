package towers;

import java.util.Scanner;

public class Ennemi {

	private int pv;
	private float posX;
	private float posY;
	private int rapidite;

	static int compteur; // variable de classe

	public int getPv() {
		return this.pv;
	}

	public void setPv(int nouvelPv) {
		if(nouvelPv > 1000 || nouvelPv < 0) {
			 this.pv = 0;
			 System.out.println("valeur trop haute retente");
		}else {
			this.pv= nouvelPv;
			System.out.println("Combattant Pret");
		}
	}
	public int getRapidite() {
		return this.rapidite;	
	}
	public void setRapidite( int nouvelleRapidite) {
		if(nouvelleRapidite < 20 || nouvelleRapidite > 0) {
			 this.rapidite = 0;
			 System.out.println("valeur trop haute retente");
		}else {
			this.rapidite = nouvelleRapidite;
			System.out.println("Combattant Pret");
		}
	}
	public float getPosX() {
		return this.posX;
	}
	public void setPosX( float newCoordoX) {
		if(newCoordoX < 250 || newCoordoX> -1) {
			this.posX = 0;
		}else {
			this.posX = newCoordoX;
		}
	}
	public float getPosY() {
		return this.posX;
	}
	public void setPosY( float newCoordoY) {
		if(newCoordoY < 250 || newCoordoY > -1) {
			this.posX = 0;
		}else {
			this.posX = newCoordoY;
		}
	}


	public Ennemi() {
		compteur++;

	}

	public Ennemi(int pv, int rapidite) {
	
		this.pv = pv;
		this.rapidite = rapidite;
	}

	public void affiche() {
		System.out.println(
				" pv : " + this.pv + " posX : " + this.posX + " posY : " + this.posY + " rapidité: " + this.rapidite);
	}

	public boolean estVivant() {
		return (this.pv > 0);
	}

	public String toString() {
		return "Ennemi : " + " pv : " + this.pv + " posX : " + this.posX + " posY : " + this.posY + " rapidité: "
				+ this.rapidite;
	}

	public static Ennemi saisirUnEnnemi() {
		Ennemi unEnnemi = new Ennemi();
		// Saisie au clavier par l'utilisateur ...
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner les points de vie: ");
		int pointsDeVie = sc.nextInt();
		unEnnemi.pv = pointsDeVie ;
		System.out.println("Donner la vitesse: ");
		unEnnemi.rapidite = sc.nextInt();
		return unEnnemi;
	}

}
