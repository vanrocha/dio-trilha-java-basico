/* 
// Sistema Medida - Caso 1

// Modo condicional if/else
public class SwitchCase {
	public static void main(String[] args) {
		String sigla = "G";

		if(sigla == "P")
			System.out.println("PEQUENO");

		else if(sigla == "M")
			System.out.println("MÉDIO");

		else if(sigla == "G")
			System.out.println("GRANDE");

		else
			System.out.println("INDEFINIDO");
			
		
	}
}
*/


 
// Sistema Medida - Caso 2

// Modo condicional switch / case

public class SwitchCase {
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
}



 