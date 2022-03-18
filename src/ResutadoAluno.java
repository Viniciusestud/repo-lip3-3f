import javax.swing.JOptionPane;

public class ResutadoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media = 6.0;
		
		/*se a média for maior que 6.0
		exisbir Aprovado 
		
		se não
		exibir Reprovado*/
		
		double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Média"));
				
		if( x >= media ) {
			JOptionPane.showMessageDialog(null,
					x + " Aprovado ");
		} else if ( x < media ) {
			JOptionPane.showMessageDialog(null, 
					x + " Reprovado ");
		}
			

	}

}
