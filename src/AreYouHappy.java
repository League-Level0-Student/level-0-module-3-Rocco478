import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Are you happy");
		if (a.equals("Yes") || (a.equals("yes"))) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing");
		}
		if(a.equals("No") ||(a.equals("no"))) {
			String B =JOptionPane.showInputDialog("Do you want to be happy");
			if(B.equals("Yes") ||(B.equals("yes"))) {
				JOptionPane.showMessageDialog(null,"change something");
			}
		
		if(B.equals("No") ||(B.equals("no"))) {
			JOptionPane.showMessageDialog(null, "keep doing what your doing");
		}
		
	}
}
}