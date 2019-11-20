package towers;

public class Terrain {

	public static void main(String[] args) {
		Ennemi unGrosMechant = new Ennemi();
		
		Ennemi unAutreEnnemi = new Ennemi();
		
		System.out.println("Nombre d'ennemi : " + Ennemi.compteur);
		
		Ennemi unVraiGrosMechant = new Ennemi(500,1);
		Ennemi lePetitRapide = new Ennemi(200,10);
		System.out.println("les points de vie du GROS MECHANT SONT : "+ unGrosMechant.getPv());
		
		
		
		Ennemi aNewMechant = new Ennemi();
		aNewMechant.setPv(2000);
		aNewMechant.getPv();
		System.out.println("les points de vie du NEW MECHANT SONT : "+ aNewMechant.getPv());
		System.out.println("les points de rapidité du GrosMechant SONT : "+ aNewMechant.getRapidite());
		
		
		
		unGrosMechant.setPv(500);
		unGrosMechant.getPv();
		unGrosMechant.setRapidite(5);
		unGrosMechant.getRapidite()	;
		unGrosMechant.setPosX(15);
		unGrosMechant.getPosX();
		System.out.println("les points de VIE du GrosMechant SONT : "+ unGrosMechant.getPv());
		System.out.println("les points de RAPIDITE du GrosMechant SONT : "+ unGrosMechant.getRapidite());
		System.out.println("les points de POSITION du GrosMechant SONT : "+ unGrosMechant.getPosX());
		System.out.println("les points de POSITION du GrosMechant SONT : "+ unGrosMechant.getPosY());

		

		//unAutreEnnemi.getRapidite();
		//System.out.println(unAutreEnnemi.rapidite);
		
		// Affichage
		//unGrosMechant.affiche();
		//unAutreEnnemi.affiche();
		// unVraiGrosMechant.affiche();
		// lePetitRapide.affiche();
		

	//	System.out.println(unGrosMechant);
		
		//System.out.println("Nombre d'ennemi : " +  unGrosMechant.compteur );
		//System.out.println("Nombre d'ennemi : " +  Ennemi.compteur );
		
		System.out.println(Ennemi.saisirUnEnnemi());
	}
	

}


