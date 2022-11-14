package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	protected int nbConnaissance = 0;
	protected String[] memoire = new String[30];
	
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
		System.out.println( nom + " - " + texte );
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void repondre() {
		direBonjour();
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " +  boisson + " ! GLOUPSSSSS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offir " + bien + " à  " + prix + " sous. ");
			perteArgent(prix);
		}
		else {
			parler("Je n'ai que "+ argent + " sous en poche. Je ne peux même pas m'offrir un "+ bien + " à  "+ prix +" sous");
		}
	}
	
	public int gagnerArgent(int gain) {
		return argent+=gain;
	}
	
	public int perteArgent(int perte) {
		return argent-=perte;
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		memoriser(humain);
		
	}
	
	public void memoriser(Humain humain) {
		memoire[nbConnaissance] = humain.getNom();
		nbConnaissance++;
	}
	
	public void listerConnaissance() {
		System.out.println(memoire);
	}
}
