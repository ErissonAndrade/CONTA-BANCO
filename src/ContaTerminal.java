/**
 * A classe {@code ContaTerminal} representa uma conta bancária associada a um terminal de atendimento.
 * Ela contém informações como o número da conta, o número da agência, o nome e sobrenome do cliente,
 * bem como o saldo disponível na conta.
 *
 * Esta classe fornece métodos para acessar e atualizar essas informações, além de oferecer uma função
 * para converter a primeira letra de uma palavra em maiúscula.
 *
 * @author Erisson Andrade
 * @version 1.0
 */
public class ContaTerminal {
    // Campos para armazenar informações da conta
    int numeroConta;
    String numeroAgencia;
    String nomeCliente;
    String sobrenomeCliente;
    double saldo;

    /**
     * Obtém o número da conta associado a esta conta.
     *
     * @return O número da conta.
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Define o número da conta associado a esta conta.
     *
     * @param numeroConta O novo número da conta.
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Obtém o número da agência associado a esta conta.
     *
     * @return O número da agência.
     */
    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    /**
     * Define o número da agência associado a esta conta.
     *
     * @param numeroAgencia O novo número da agência.
     */
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    /**
     * Converte a primeira letra da palavra em maiúscula.
     *
     * @param input A palavra a ser processada.
     * @return A palavra com a primeira letra em maiúscula.
     */
    public String primeiraLetraMaiuscula(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    /**
     * Obtém o nome do cliente associado a esta conta.
     *
     * @return O nome do cliente.
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Define o nome do cliente associado a esta conta.
     *
     * @param nomeCliente O novo nome do cliente.
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Obtém o sobrenome do cliente associado a esta conta.
     *
     * @return O sobrenome do cliente.
     */
    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    /**
     * Define o sobrenome do cliente associado a esta conta.
     *
     * @param sobrenomeCliente O novo sobrenome do cliente.
     */
    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
    }

    /**
     * Obtém o saldo disponível na conta.
     *
     * @return O saldo da conta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo disponível na conta.
     *
     * @param saldo O novo saldo da conta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
