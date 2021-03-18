import javax.swing.JOptionPane;

public class ListaTemperatura {

	private node nohTempInicio;

	public ListaTemperatura() {
		nohTempInicio = null;
	}

	public void AdicionaInicio(int temperatura) {
		node noh = new node(temperatura);
		noh.prox = nohTempInicio;
		nohTempInicio = noh;
	}

	public void AdicionaFinal(int temperatura) {

		node noh = new node(temperatura);
		if (nohTempInicio == null) {
			nohTempInicio = noh;
		} else {
			node aux = nohTempInicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = noh;
		}
	}
	
	
	public void AdicionaPosicao(int temperatura, int pos) {
		
		node nohNovo = new node(temperatura);
		
		if(pos ==1) {
			AdicionaInicio(temperatura);
		}
		else {
			node nohAux = nohTempInicio;
			int contador = 1;
			
			while(nohAux !=null && contador< (pos-1)) {
				nohAux = nohAux.prox;
				contador++;
			}
			if(contador == (pos-1)) {
				nohNovo.prox = nohAux.prox;
				nohAux.prox = nohNovo;
			}
			else {
				JOptionPane.showMessageDialog(null, "Posição inválida");
			}
			
		}
	}
	
	
	public int RemoveInicio() {
		
		int i = 0;
		if(nohTempInicio == null) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
		}
		else {
			i = nohTempInicio.dado;
			nohTempInicio = nohTempInicio.prox;
		}
		return i;
	}
	
	public int RemoveFinal() {
		int i = 0;
		
		if(nohTempInicio ==null) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
		}
		else if(nohTempInicio.prox == null) {
			i = nohTempInicio.dado;
			nohTempInicio = null;
		}
		else {
			node nohAux1 = nohTempInicio, nohAux2 = null;
			while(nohAux1.prox !=null) {
				nohAux2 = nohAux1;
				nohAux1 = nohAux1.prox;
			}
			i = nohAux1.dado;
			nohAux2.prox = null;
		}
		return i;
	}
	
	public int removePosicao(int pos) {
		int i = 0;
		int j = 1;
		node nohAux = nohTempInicio;
		
		
		
		if(nohTempInicio != null) {
			if(pos == 1) {
				i = RemoveInicio();
				return i;
			}
			else {
				while(nohAux.prox !=null) {
					nohAux = nohAux.prox;
					j++;
				}
				if (pos > j || pos <= 0) {
					JOptionPane.showMessageDialog(null, "Posição inválida");
					return i;
				}
				else if(pos == j) {
					i = RemoveFinal();
					return i;
				}
				else {
					nohAux = nohTempInicio;
					node nohAux2 = nohAux;
					
					while(pos>1) {
						nohAux2 = nohAux;
						nohAux = nohAux.prox;
						pos--;
					}
					i = nohAux.dado;
					nohAux2.prox = nohAux.prox;
					return i;
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Lista vazia");
			return i;
		}
		
	}

	public void percorreLista() {
		if(nohTempInicio != null) {
			node nohAux = nohTempInicio;
			System.out.println("Lista de temperatura: ");
			System.out.print(nohAux.dado + " | ");
			
			while(nohAux.prox != null) {
				nohAux = nohAux.prox;
				System.out.print(nohAux.dado + " | ");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Lista vazia");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
