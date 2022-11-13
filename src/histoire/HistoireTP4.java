package histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain beaugoss = new Humain( "beaugoss", "kombucha", 54);
		beaugoss.direBonjour();	
		beaugoss.acheter("une boisson",12);
		beaugoss.boire();	
		beaugoss.acheter("un jeu",2);
		beaugoss.acheter("un kimono",50);
		Commerçant yoan = new Commerçant (" yoan", "thé", 20);
		yoan.direBonjour();
		yoan.seFaireExtorquer();
		yoan.recevoir(15);
		yoan.boire();
		Yakuza assane = new Yakuza ("assane","whisky", 30, "Gang de Toilette");
		assane.extorquer(yoan);
		Ronin rhonin = new Ronin ("rhonin","shochu", 60);
		rhonin.direBonjour();
		rhonin.donner(yoan);
		rhonin.provoquer(assane);
		
	}
	
	

}
