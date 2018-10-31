import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
public class Soundfx {
	  public void sound(){
	    try{
	      File soundFile = new File("bin/lol.wav");
	      AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	      AudioFormat format = audioIn.getFormat();
	      DataLine.Info info = new DataLine.Info(Clip.class, format);
	      Clip clip = (Clip)AudioSystem.getLine(info);
	      clip.open(audioIn);
	      clip.start();
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	  }
}
