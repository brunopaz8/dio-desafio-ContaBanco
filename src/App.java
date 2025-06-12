import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        contaBanco user = new contaBanco();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        user.Numero = entrada.nextInt();
        entrada.nextLine(); 

        System.out.println("Por favor, digite o nome da Agência !");
        user.Agencia = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        user.NomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo da sua conta !");
        user.Saldo = entrada.nextDouble();

        entrada.close();

        user.ExibirInformações();
    }
}
