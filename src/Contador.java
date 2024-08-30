import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            throw new ParametrosInvalidosException(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois){
          throw new ParametrosInvalidosException(String.format("O segundo parâmetro: %d  deve ser maior que o primeiro: %d", parametroDois,parametroUm));
        }

        int contagem = parametroDois - parametroUm;

        for (var i = 1 ; contagem >= i ; i ++  ){
            System.out.println("Imprimindo o número: "+ i);
        }

    }
}
