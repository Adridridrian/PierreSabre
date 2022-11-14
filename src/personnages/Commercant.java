package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	public int seFaireExtorquer() {
		int perte=getArgent();
		perteArgent(perte);
		parler(" J'ai tout perdu ! Le monde est trop injuste sacrebleu");
		return perte;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent +" sous ! Je te remercie généreux donateur extrêmement beau !");
	}

}
