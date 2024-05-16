// ResultadoEscolar.java
public class CondicionaisEncadeadas {
    public static void main(String[] args) {
        int nota = 10;

	if (nota >= 7)
		System.out.println("Aprovado");

	else if (nota >= 5 && nota < 7)//Sempre tem que retornar true ou false
		System.out.println("Recuperação");

	else
		System.out.println("Reprovado");
    }
}
    

