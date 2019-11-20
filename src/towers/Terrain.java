package towers;

public class Terrain {

	public static void main(String[] args) {
		Ennemi unGrosMechant = new Ennemi();
		Ennemi unAutreEnnemi = new Ennemi();
		System.out.println("Nombre d'ennemi : " + Ennemi.compteur);
		Ennemi unVraiGrosMechant = new Ennemi(500,1);
		Ennemi lePetitRapide = new Ennemi(200,10);
		//System.out.println(unGrosMechant.pv);
		unGrosMechant.pv = 200;
		//System.out.println(unGrosMechant.pv);
		unAutreEnnemi.rapidite=3;
		//System.out.println(unAutreEnnemi.rapidite);
		
		// Affichage
		//unGrosMechant.affiche();
		//unAutreEnnemi.affiche();
		// unVraiGrosMechant.affiche();
		// lePetitRapide.affiche();
		

		System.out.println(unGrosMechant);
		
		System.out.println("Nombre d'ennemi : " +  unGrosMechant.compteur );
		System.out.println("Nombre d'ennemi : " +  Ennemi.compteur );
		
		System.out.println(Ennemi.saisirUnEnnemi());
	}
	

}


