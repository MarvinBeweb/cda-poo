package towers;

import java.util.Scanner;

public class Ennemi {

	int pv;
	float posX;
	float posY;
	int rapidite;

	static int compteur; // variable de classe
	
	
	public Ennemi() {
		compteur++;
		this.pv = 100;
		this.posX = 0;
		this.posY = 0;
		this.rapidite = 2;
	}

	public Ennemi(int pv, int rapidite) {
		compteur++;
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
		return "Ennemi : " + " pv : " + this.pv + " posX : " + this.posX + " posY : " + this.posY + " rapidité: " + this.rapidite;
	}
	
	public static Ennemi saisirUnEnnemi() {
		Ennemi unEnnemi = new Ennemi();
		// Saisie au clavier par l'utilisateur ...
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner les points de vie: ");
		int pointsDeVie = sc.nextInt();
		unEnnemi.pv = pointsDeVie;
		System.out.println("Donner la vitesse: ");
		unEnnemi.rapidite = sc.nextInt();	
		return unEnnemi;
	}
	
	
	
	
	
	
	
	
	
	

}
