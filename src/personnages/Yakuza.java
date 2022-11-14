package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom,String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Ehe, en voil� une br�le qui va fuir la queue entre les jambes");
		parler(victime.getNom() +" donne moi ta thune sinon je t'arrache les ongles");
		int argents=victime.seFaireExtorquer();
		gagnerArgent(argents);
		parler("J'ai chour� les " + argents + " sous de " +victime.getNom()+ ", ce qui me fait " + argent + " sous TSHIHIHIHA ");
		reputation+=1;
	}
	
	public void perdre() {
		parler("J'ai perdu mon duel et mes "+ argent +" sous, *pleure*... J'ai d�shonor� le clan de " + clan );
		perteArgent(argent);
		reputation--;
	}
	
	public void gagner(int gain) {
		argent+=gain;
		reputation++;
		parler("Youhouhou j'ai gagn�, quel idiot ce ronin, j'ai désormais " + argent + " sous et j'ai honor� le clan " + clan );
	}

}
