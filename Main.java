import static javax.swing.JOptionPane.*;
public class Main {

	static Pilha< String > pilha;
	//isto significa que será uma pilha de obejetos da classe string
	
	public static void main(){
		pilha = new Pilha<String>(50);
		
		
		while ( !pilha.cheia() ){
			String str = showInputDialog("Informe um texto");
			if ( str == null) break;
			pilha.incluir(str);
		}
		
		String str = "Itens da pilha: ";
		while ( !pilha.vazia() ){
			str += "\n" + pilha.excluir();
			showInputDialog(null,str);
		}
	}
}
