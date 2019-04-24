import javax.swing.JOptionPane;

public class bobnotjava {
	public static void main(String[] args) {
		int password = 374;
		String d = JOptionPane.showInputDialog("GIMME SECRET!!!");
		JOptionPane.showMessageDialog(null, "you can see a secret if you know the password");
		String s = JOptionPane.showInputDialog("guess the password");

		if (s.equals("374")) {
			JOptionPane.showMessageDialog(null, "heres te secret :( " + d);
		} else {
			JOptionPane.showMessageDialog(null, "INTUDER!!!");
		}

	}
}
