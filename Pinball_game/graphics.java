import javax.swing.JFrame;
public class graphics
{
public static void main(String[] args)
{
	JFrame frame = new JFrame();
	frame.setSize(1920,1080);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Pinball_game panel = new Pinball_game();
	frame.add(panel);
	frame.setVisible(true);
}
}

