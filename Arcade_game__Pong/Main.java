import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setTitle("Pong");
		Pong p = new Pong();
		frm.setContentPane(p);
		frm.setSize(300, 700);
		frm.setResizable(false);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}