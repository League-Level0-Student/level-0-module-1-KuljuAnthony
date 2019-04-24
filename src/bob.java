import javax.swing.JOptionPane;

public class bob {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bob \n Bob JR \n bOBmAN");
		String d = JOptionPane.showInputDialog("Type in one of those names.");

		if (d.equalsIgnoreCase("Bob")) {
			JOptionPane.showMessageDialog(null, "Bob stinks");
		}
		if (d.equalsIgnoreCase("Bob JR")) {
			JOptionPane.showMessageDialog(null, "Bob JR sucks");
		}
		if (d.equalsIgnoreCase("bOBmAN")) {
			JOptionPane.showMessageDialog(null, "bOBmAN smells");
		}

	}
}
