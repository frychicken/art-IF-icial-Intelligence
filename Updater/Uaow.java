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
	public void doup() {
		String cheee = getClass().getResource("").toString();
		cheee = cheee.substring(cheee.indexOf(":")+1);
		File file = new File(cheee+"/AOW.jar"); 
		try {
			file.delete();
		} catch (Exception e) {
			System.out.println("cannot find file");
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
			e.printStackTrace();
		}

		JOptionPane.showConfirmDialog((Component) null, "Update completed",
				"Update", JOptionPane.CLOSED_OPTION);
	}
}


