public class Obstacle {
	public static void main(String[] args) throws Exception {
		String f = "Avoiding objects simulator by @frychicken";
		for (int i =0; i<f.length(); i++) {
			String c = f.substring(i, i+1);
			System.out.print(c);
			try {
				Thread.sleep(90); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		System.out.println();
		Nani nina = new Nani();
		nina.Nihaoma();
		System.out.println("All Done!");
		System.exit(0);
	}
}

