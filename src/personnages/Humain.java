package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain( String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public void parler(String texte) {
		System.out.println( texte );
		
	}
	
	private String direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}

	private String boire() {
		parler("Mmmm, un bon verre de " +  boisson + " ! GLOUPSSSSS !");
	}
	
	private String acheter(String bien, int prix) {
		parler("J'ai " + bien + " en poche. Je vais pouvoir m'offir une boisson à " + prix + " sous. ");
	}
	
	public int gagnerArgent(int gain) {
		return argent+=gain;
	}
	
	public int perteArgent(int perte) {
		return argent-=perte;
	}
}
