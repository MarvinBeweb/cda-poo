package chat;

public class Cat {
	
	// Attributs 
	String color;
	String name;
	
	
	
	/**
	 * Constructeur sans parametre
	 */
	public Cat() {
		System.out.println("Naissance d'un nouveau chat");
		this.name = "Arthur";
		this.color = "Gris";
	}
	
	/**
	 * Constructeur avec parametre
	 * @param pName : String
	 * @param pColor : String
	 */
	public Cat(String pName, String pColor) {
		System.out.println("Naissance d'un nouveau chat");
		this.name = pName;
		this.color = pColor;
	}
	
	/**
	 * Permet d'afficher une description du chat
	 */
	public void getDescription() {
		System.out.println("Le chat " + this.color + " s'appelle " + this.name);
	}
	
	/**
	 * Methode qui permet d'ecouter le chat
	 */
	public void listen() {
		System.out.println("Miaouuuuuu");
	}
	
	/**
	 * Methode qui permet de nourrir le chat
	 * @param food : String
	 */
	public void eat(String food) {
		System.out.println(this.name + " mange " + food);
	}
	
	/**
	 * Methode qui permet d'envoyer le chat a la chasse
	 * @return String
	 */
	public String hunt() {
		System.out.println(this.name + " part à la chasse ");
		String[] chasse = {"souris", "oiseau", "chaussette"};
		int n = (int)(Math.random() * 3);
		return chasse[n];
	} 
	
	/**
	 * Methode qui fait dormir notre chat
	 */
	public void sleep() {
		System.out.println(this.name + " dort");
	}
}
