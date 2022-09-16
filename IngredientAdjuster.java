import javax.swing.JOptionPane;
public class IngredientAdjuster {

	public static void recipeFinder() {
		String input;
		int answer;
		
		JOptionPane.showMessageDialog(null, "Welcome to the cookie calculator!","Welcome!", JOptionPane.INFORMATION_MESSAGE);
		
		//Question 1
		input= JOptionPane.showInputDialog(null, "How many cookies do you want to make?","Cookie Calculator",JOptionPane.INFORMATION_MESSAGE);
		answer= Integer.parseInt(input);
		double sugar=(1.5/48)*answer;
		double butter=(1.0/48)*answer;
		double flour=(2.75/48)*answer;
		JOptionPane.showMessageDialog(null, "You need:\n"+String.format("%.2f",sugar)+" cups of sugar\n"+String.format("%.2f",butter)+" cups of butter\n"+String.format("%.2f",flour)+" cups of flour\nto make "+answer+" cookies.","Cookie Calculator",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public static void main(String args[]){
	recipeFinder();
	}
}
