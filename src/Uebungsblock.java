public class Uebungsblock {

	// Achtung: Zur Ausfuehrung des Programms muss das Uebungstools.jar
	// eingebundenwerden. Die Anleitung finden Sie in den Folien zu dieser
	// Uebung: https://github.com/nordakademie-einfuehrung-java/vorlesungsskript/blob/master/folien/Semester_03_Termin_05_Uebungsblock_01-04.ppt

	/**
	 * Die Mainmethode ermoeglicht den Aufruf der einzelnen Uebungen ueber einen Abfragedialog
	 */
	public static void main(String[] args) {

		boolean ende = false;
		while (!ende) {

			int nr = Eingabe.frageNachIntUeberDialog("Bitte Uebungsnr eingeben (1-7, 0 zum Beenden):");

			Zeichenfenster.zeigeZeichenfenster();
			Zeichenfenster.clearZeichenfenster();
			Zeichenfenster.setzeFarbeSchwarz();

			if (nr == 1) {
				uebung1();
				Zeichenfenster.zeichnePunkt(5, 100);
				Zeichenfenster.zeichnePunkt(552, 160);
				Zeichenfenster.zeichnePunkt(50, 700);
			}
			if (nr == 2) {
				uebung2();
				for(int a =0; a<81;a++) {
					Zeichenfenster.zeichneLinie(0, 800-(a*10), 800-(a*10), 0);
				}
			}
			if (nr == 3) {
				uebung3();
				for(int a =0; a<61;a++) {
					Zeichenfenster.zeichneEllipse(200+5*a, 400, 100+5*a, 100+5*a);
				}
			}
			if (nr == 4) {
				uebung4();
				for(int a =0; a<61;a++) {
					Zeichenfenster.zeichneEllipse(400, 400, 800-10*a, 200+10*a);
				}
			}
			if (nr == 5) {
				uebung5();
				for(int a =0; a<101;a++) {
					Zeichenfenster.zeichneLinie(0+8*a, 0, 800, 0+8*a);
					Zeichenfenster.zeichneLinie(0, 0+8*a, 0+8*a, 800);
					Zeichenfenster.zeichneLinie(0, 800-8*a, 0+8*a, 0);
					Zeichenfenster.zeichneLinie(0+8*a, 800, 800, 800-8*a);
				}
			}
			if (nr == 6) {
				uebung6();
				for (int a = 0; a < 801; a++) {
					for (int b = 0; b < 801; b++) {
						double rotAbstand = ermittleAbstand(a, b, 250, 270);
						double gruenAbstand = ermittleAbstand(a, b, 550, 270);
						double blauAbstand = ermittleAbstand(a, b, 400, 530);

						Zeichenfenster.setzeFarbe((800 - rotAbstand) / 800, (800 - gruenAbstand) / 800,
								(800 - blauAbstand) / 800);
						Zeichenfenster.zeichnePunkt(a, b);
					}
				}
			}
			if (nr == 7) {
				uebung7();
				for (int a = 0; a < 801; a++) {
					for (int b = 0; b < 801; b++) {
						double rotAbstand = ermittleAbstand(a, b, 250, 270);
						double gruenAbstand = ermittleAbstand(a, b, 550, 270);
						double blauAbstand = ermittleAbstand(a, b, 400, 530);

						Zeichenfenster.setzeFarbe(AbstandInFarbe(rotAbstand), AbstandInFarbe(gruenAbstand),
								AbstandInFarbe(blauAbstand));
						Zeichenfenster.zeichnePunkt(a, b);
					}
				}
			}
			if (nr == 0) {
				System.exit(0);
			}
		}

	}

	public static void uebung1() {
		// TODO Implementieren Sie die Uebung 1
	}

	public static void uebung2() {
		// TODO Implementieren Sie die Uebung 2
	}

	public static void uebung3() {
		// TODO Implementieren Sie die Uebung 3
	}

	public static void uebung4() {
		// TODO Implementieren Sie die Uebung 4
	}

	public static void uebung5() {
		// TODO Implementieren Sie die Uebung 5
	}

	public static void uebung6() {
		// TODO Implementieren Sie die Uebung 6
	}

	public static void uebung7() {
		// TODO Implementieren Sie die Uebung 7
	}
public static double ermittleAbstand(int x1, int y1, int x2, int y2) {
	
	return Math.round(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
}
public static double AbstandInFarbe(double abstand) {
	if (abstand > 400) {
		return 0;
	} else if (abstand < 200) {
		return 1.0;
	}
	return (400 - abstand) / 200;
}
}
