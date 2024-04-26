import java.util.Scanner;

public class Bradesco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Variaveis
        String nome = "Victor Hugo";
        String tipoDeConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

//      Tela inicial
        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

//      Menu
        String menu = """
                Operações
                1 - Consultar Saldo
                2 - Pix
                3 - Receber Pix
                4 - Sair
                Digite a opção desejada:
                """;

//      Loop
        while (opcao !=4){
            System.out.println(menu);
            opcao = scanner.nextInt();

//          Condições
            if (opcao == 1 ){
                System.out.println("saldo atual é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o Valor para transferir o Pix?");
                double valor = scanner.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo indisponivel");
                }else {
                    saldo -= valor;
                    System.out.println("Saldo De: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("valor De deposito: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            }else if (opcao == 4){
                System.out.println("Tchau meu assalariado <3");
            }
            else if (opcao != 4) {
                System.out.println("Opção invalida. sabe ler não ?");
            }

        }
    }
}
