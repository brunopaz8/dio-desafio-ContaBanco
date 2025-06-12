public class contaBanco {

    public int Numero;
    public String Agencia;
    public String NomeCliente;
    public double Saldo;

    public void ExibirInformações() {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s , conta %s e seu saldo %s já está disponível para saque.", NomeCliente, Agencia, Numero, Saldo);
    }
}
