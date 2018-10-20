import java.util.*;
import java.awt.event.*;
import javax.swing.*;
class Dog_{
public static int cat_() throws Exception {
     List<Integer> doggo = new LinkedList<Integer>();

     JFrame frame = new JFrame("Enter how many labs you want (default 10)");
     JTextField field = new JTextField("10");
    frame.add(field);
    field.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            synchronized (doggo) {
      
            	try {  doggo.add(Integer.parseInt(field.getText())); } catch (Exception ee) {
            		JOptionPane.showMessageDialog(frame, "Enter a number");
            		doggo.add((Integer.parseInt(field.getText())));
            	}
                doggo.notify();
            }
            frame.dispose();
        }
    });
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 60);
    frame.setResizable(false);
    frame.setVisible(true);
     synchronized (doggo) {
      while (doggo.isEmpty())
            doggo.wait();
            int nextInt = doggo.remove(0);
            return nextInt;
          }
     }
}
