
public class Nani {
	static Frychicken fry = new Frychicken();
	public void Nihaoma() throws Exception {
		int b = 10; 
		String reduc = Dog_.cat_();
		int tess = reduc.indexOf(".");
		b = Integer.valueOf(reduc.substring(0,tess));
		System.out.println("Lab(s): "+b);
		int i = 1;
		int userin = Integer.valueOf(reduc.substring(tess+1));
		if (userin > 3 || userin<0)
			while (userin >3 || userin <=0) {
				userin = Integer.valueOf(Dog_.cat_().substring(tess+1));
				if (userin >3 || userin <=0)
					fry.ChickenIsNotFood();
			}
		boolean debugg = true;
		int n = -1;
		int st = fry.FriedChicken();
		System.out.println("Obstacle(s): "+ userin);
		while (i <= b) {
			Execut exec = new Execut(userin); 
			if (st != 0) {
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
