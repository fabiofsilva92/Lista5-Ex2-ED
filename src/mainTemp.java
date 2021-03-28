import javax.swing.JOptionPane;

public class mainTemp {

	public static void main(String[] args) {
		
		int opc = 0, pos, temperatura, removido;
		
		ListaTemperatura lt = new ListaTemperatura();
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adiciona Final \n "
					+ "2 - Adiciona inicio \n "
					+ "3 - Escolhe posição \n "
					+ "4 - Remove Final \n +"
					+ "5 - Remove Inicio\n"
					+ "6 - Esolhe posição para remover\n"
					+ "7 - Exibir lista;"));
			
			switch(opc) {
			
			case 1:
				temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura: "));
				lt.AdicionaFinal(temperatura);
				break;
				
			case 2:
				temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura: "));
				lt.AdicionaInicio(temperatura);
				break;
				
			case 3: 
				temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura"));
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe uma posição para inserção: "));
				lt.AdicionaPosicao(temperatura, pos);
				break;
				
			case 4: removido = +lt.RemoveFinal();
				if(removido != 999999999) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + removido );
				}
				break;
				
			case 5: removido = +lt.RemoveInicio();
				if(removido != 999999999) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + removido );
				}	
				break;
				
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição para remoção"));
				removido = lt.removePosicao(pos);
				if(removido != 999999999) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + removido );
				}	
				break;
				
			case 7:
				lt.percorreLista();
				break;
			}
			
		}while (opc != 0);

	}

}
