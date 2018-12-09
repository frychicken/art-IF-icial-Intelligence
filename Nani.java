import java.awt.Color;

public class Nani {
	static Frychicken fry = new Frychicken();
	public void Nihaoma() throws Exception {
		int b = 10; 
		Dog_ doge = new Dog_();
		String reduc = doge.cat_();
		Color obstacle = new Color(Integer.valueOf(reduc.substring(reduc.indexOf("*")+1,reduc.indexOf("!"))),Integer.valueOf(reduc.substring(reduc.indexOf("!")+1,reduc.indexOf("@"))),Integer.valueOf(reduc.substring(reduc.indexOf("@")+1,reduc.indexOf("#"))));
		Color object = new Color(Integer.valueOf(reduc.substring(reduc.indexOf("#")+1,reduc.indexOf("$"))),Integer.valueOf(reduc.substring(reduc.indexOf("$")+1,reduc.indexOf("%"))),Integer.valueOf(reduc.substring(reduc.indexOf("%")+1, reduc.indexOf("^"))));
		int tess = reduc.indexOf(".");
		b = Integer.valueOf(reduc.substring(0,tess));
		System.out.println("Lab(s): "+b);
		int i = 1;
		int userin = Integer.valueOf(reduc.substring(tess+1, reduc.indexOf(",")));
		if (userin > 3 || userin<=0)
			while (userin >3 || userin <=0) { 
				if (userin >3 || userin <=0)
					fry.ChickenIsNotFood();
				userin = Integer.valueOf(doge.cat_().substring(tess+1, reduc.indexOf(",")));
			
			}
		boolean debugg = true;
		boolean sound = true;
		int n = -1;
		int st = Integer.valueOf(reduc.substring(reduc.indexOf(",")+1,reduc.indexOf("*")));
		int stt = Integer.valueOf(reduc.substring(reduc.indexOf("^")+1, reduc.indexOf("&")));
		int sttt = Integer.valueOf(reduc.substring(reduc.indexOf("&")+1));
		boolean autopilot = true;
		System.out.println("Obstacle(s): "+ userin);
		while (i <= b) {
			Execut exec = new Execut(userin, object, obstacle,i,b); 
			if (st != 1) {
				debugg = false;
				if (stt != 1) {
					sound = false;
				}
				else sound = true;
				if (sttt != 1) {
					autopilot = true;
				}
				else autopilot = false;
				exec.assin(debugg, sound, autopilot);
			}
			else { 
				debugg = true; 
				if (stt != 1) {
					sound = false;
				}
				else sound = true;
				if (sttt != 1) {
					autopilot = true;
				}
				else autopilot = false;
				exec.assin(debugg, sound, autopilot);
				}
	
			if (n == -1) {
			System.out.println("Debug mode = " +debugg);
			System.out.println("Sound: " +sound);
			System.out.println("Auto-pilot= "+autopilot);
			}
			exec.run();
			System.out.println("lap: "+ i++);
			n++;
		}
		if (fry.ChickenNotFood() != 0) {  System.out.println("Ok, doing it"); Nihaoma(); }
		else return;
	}
}
