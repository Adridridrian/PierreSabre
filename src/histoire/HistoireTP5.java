package histoire;

import personnages .* ;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco","thé",20);
		Commercant chonin = new Commercant("Chonin","thé", 40);
		Commercant kumi = new Commercant("Kumi","thé", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		roro.faireConnaissanceAvec(marco);
		marco.faireConnaissanceAvec(yaku);
		yaku.faireConnaissanceAvec(marco);
		marco.faireConnaissanceAvec(chonin);
		chonin.faireConnaissanceAvec(marco);
		marco.faireConnaissanceAvec(kumi);
		kumi.faireConnaissanceAvec(marco);
		marco.listerConnaissance();
	}

}
