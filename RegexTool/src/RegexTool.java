import javax.swing.JFrame;
import javax.swing.JLabel;


public class RegexTool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createGUI();
			}
			
		});
		
	}
	
	public static void createGUI() {
		JFrame f = new JFrame("Regex Tool");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLbl = new JLabel("Zu überprüfender Text: ");
		
		f.getContentPane().add(textLbl);
		
		f.pack();
		f.setVisible(true);
	}

}
