
    // CaixaEletronico.java
public class CondicionalSimples {
    public static void main(String[] args) {

       double saldo = 26.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}

