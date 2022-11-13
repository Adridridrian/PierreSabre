package personnages;

public class Commerçant extends Humain {
	public Commerçant(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	public void seFaireExtorquer() {
		perteArgent(argent);
		parler(" J'ai tout perdu ! Le monde est trop injuste sacrebleu");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent +" sous ! Je te remercie généreux donateur extrêmement beau !");
	}

}
