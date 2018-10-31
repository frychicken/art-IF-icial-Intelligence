import java.awt.Color;

public class Nani {
	static Frychicken fry = new Frychicken();
	public void Nihaoma() throws Exception {
		int b = 10; 
		Dog_ doge = new Dog_();
		String reduc = doge.cat_();
		Color obstacle = new Color(Integer.valueOf(reduc.substring(reduc.indexOf("*")+1,reduc.indexOf("!"))),Integer.valueOf(reduc.substring(reduc.indexOf("!")+1,reduc.indexOf("@"))),Integer.valueOf(reduc.substring(reduc.indexOf("@")+1,reduc.indexOf("#"))));
		Color object = new Color(Integer.valueOf(reduc.substring(reduc.indexOf("#")+1,reduc.indexOf("$"))),Integer.valueOf(reduc.substring(reduc.indexOf("$")+1,reduc.indexOf("%"))),Integer.valueOf(reduc.substring(reduc.indexOf("%")+1)));
		int tess = reduc.indexOf(".");
		b = Integer.valueOf(reduc.substring(0,tess));
		System.out.println("Lab(s): "+b);
		int i = 1;
		int userin = Integer.valueOf(reduc.substring(tess+1, reduc.indexOf(",")));
		if (userin > 3 || userin<=0)
			while (userin >3 || userin <=0) { 
				userin = Integer.valueOf(doge.cat_().substring(tess+1, reduc.indexOf(",")));
				if (userin >3 || userin <=0)
					fry.ChickenIsNotFood();
			}
		boolean debugg = true;
		int n = -1;
		int st = Integer.valueOf(reduc.substring(reduc.indexOf(",")+1,reduc.indexOf("*")));
		System.out.println("Obstacle(s): "+ userin);
		while (i <= b) {
			Execut exec = new Execut(userin, object, obstacle,i,b); 
			if (st != 1) {
				debugg = false;
				exec.assin(debugg);
			}
			else { debugg = true; exec.assin(debugg);}
			if (n == -1)
			System.out.println("Debug mode = " +debugg);
			exec.run();
			System.out.println("lap: "+ i++);
			n++;
		}
		if (fry.ChickenNotFood() != 0) {  System.out.println("Ok, doing it"); Nihaoma(); }
		else return;
	}
}
