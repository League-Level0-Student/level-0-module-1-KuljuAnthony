import javax.swing.JOptionPane;

public class bobhatesjava {
	public static void main(String[] args) {

		int score = 0;
		String a = JOptionPane.showInputDialog(
				" what walks on 4 legs in the morning \b 2 legs in the afternoon \b and 3 legs in the evening");
		if (a.equalsIgnoreCase("A Human")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "sorry that is incorrect the correct awsner is a human");
		}

	}
}
