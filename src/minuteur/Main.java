package minuteur;

public class Main {

	public static void main(String[] args) {
		Minuteur minuteur = new Minuteur();
		
		minuteur.tic(); // 1 s
		minuteur.tic(); // 2 s
		minuteur.avancer(57); // 3 s .. 59 s 
		minuteur.tic(); // revient � 0
		 
// minuteur.minute = 80; // Ceci est interdit
		
		// Acc�s en �criture
		minuteur.setMinute(80);
		minuteur.avancer(10);
		minuteur.setMinute(-5);
		minuteur.avancer(10);


		// Acc�s en lecture
		System.out.println("Le nombre de minute = " + minuteur.getMinute());
	}

}
