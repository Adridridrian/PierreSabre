package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	public Ronin(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		parler(beneficiaire.getNom() + " prend ces " + (argent*10)/100 + " sous");
		beneficiaire.recevoir((argent*10)/100);
		perteArgent((argent*10)/100);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		parler("Je t'ai retrouvé sac à  crottes, tu vas payer pour le marchand enflure");
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza de mes deux");
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			honneur++;
		}
		else {
			honneur--;
			parler("Vraiment ? J'ai perdu ? Oh la honte...");
			adversaire.gagner(argent);
			perteArgent(argent);
		}
	}

}
