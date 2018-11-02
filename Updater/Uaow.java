import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import javax.swing.JOptionPane;
class Uaow {
	public static void main(String[] args) throws IOException { 
		Upd ipd = new Upd();
		ipd.doup();
	}
}
class Upd{
	public void doup() throws IOException {
		File file2[] = new File[8];
		file2[0] = new File(getClass().getResource("Dog_.class").toString().substring(getClass().getResource("Dog_.class").toString().indexOf(":")+1));
    	file2[2] = new File(getClass().getResource("Execut.class").toString().substring(getClass().getResource("Execut.class").toString().indexOf(":")+1));
		file2[3] = new File(getClass().getResource("Nani.class").toString().substring(getClass().getResource("Nani.class").toString().indexOf(":")+1));
		file2[4] = new File(getClass().getResource("Soundfx.class").toString().substring(getClass().getResource("Soundfx.class").toString().indexOf(":")+1));
		file2[5] = new File(getClass().getResource("Loading.class").toString().substring(getClass().getResource("Loading.class").toString().indexOf(":")+1));
		file2[1] = new File(getClass().getResource("Frychicken.class").toString().substring(getClass().getResource("Frychicken.class").toString().indexOf(":")+1));
		file2[6] = new File(getClass().getResource("Execut$Method_T.class").toString().substring(getClass().getResource("Execut$Method_T.class").toString().indexOf(":")+1));
		file2[7] = new File(getClass().getResource("Dog_$1.class").toString().substring(getClass().getResource("Dog_$1.class").toString().indexOf(":")+1));

		for(int a =0; a<8; a++) {
		try {
			file2[a].delete();
		} catch (Exception e) {
			System.out.println("cannot find file"+file2[a]);
			JOptionPane.showConfirmDialog((Component) null, "Cannot find file"+file2[a],
					"Update", JOptionPane.CLOSED_OPTION);
			e.printStackTrace();
		 }
		}
		String cheee = getClass().getResource("").toString();
		cheee = cheee.substring(cheee.indexOf(":")+1);
		File file = new File(cheee+"/AOW.jar"); 
		try {
			file.delete();
		} catch (Exception e) {
			System.out.println("cannot find file");
			JOptionPane.showConfirmDialog((Component) null, "Cannot find file\n AOW.jar",
					"Update", JOptionPane.CLOSED_OPTION);
			e.printStackTrace();
		}
		try {
			URL website = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/JarFile/AOW.jar");
			ReadableByteChannel ok = Channels.newChannel(website.openStream());
			FileOutputStream okay = new FileOutputStream(cheee+"/AOW.jar");
			okay.getChannel().transferFrom(ok, 0, Long.MAX_VALUE);
			okay.close();
			ok.close();
		} catch (Exception e) {
			System.out.println("Update failed");
			JOptionPane.showConfirmDialog((Component) null, "Update failed\n Cannot download file",
					"Update", JOptionPane.CLOSED_OPTION);
			e.printStackTrace();
		}
		Runtime r= Runtime.getRuntime();
		r.exec("java -jar AOW.jar");
		JOptionPane.showConfirmDialog((Component) null, "Update completed",
				"Update", JOptionPane.CLOSED_OPTION);
	}
}


