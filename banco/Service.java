package banco;

import java.util.Scanner;

public class Service {
    // Variaveis
    private int numConta = this.gerarNumeroConta();
    protected int saldo;
    private String tipoConta;
    private String dono;
    private Boolean status;
    Scanner verificar = new Scanner(System.in);

    // Geração de número de conta aleatório.
    private int gerarNumeroConta() {
        return (int) Math.floor(Math.random() * (9999999 - 1111111) + 1111111);

    }

    // Contructor
    public Service(String dono, String tipo) {
        this.dono = dono;
        this.status = false;
        tC(tipo);

    }

    // Menu da Aplicação.
    public void menu(boolean start) {
        while (start) {
            System.out.println("_________Menu_________");
            System.out.print("0 -");
            System.out.println("Perfil");
            System.out.print("1 -");
            System.out.println("Depositar");
            System.out.print("2 -");
            System.out.println("Sacar");
            System.out.print("3 -");
            System.out.println("FecharConta");
            System.out.println("       ");
            System.out.print("4 -");
            System.out.println("Sair");
            System.out.println("O que você deseja? ");
            System.out.println("______________________");
            int resp = verificar.nextInt();
            if (this.status) {
                switch (resp) {
                    case 0:
                        veriStatus();

                        break;

                    case 1:
                        System.out.println("Quanto deseja depositar? ");
                        int dinheiro = verificar.nextInt();

                        depositar(dinheiro);
                        System.out.println("Depoisito realizado com Sucesso!!");
                        System.out.println("0 - Voltar                1 - Sair");
                        resp = verificar.nextInt();
                        if (resp == 0) {
                            continue;
                        } else if (resp == 1) {
                            return;
                        }
                        break;

                    case 2:
                        System.out.println("Seu saldo é de : " + getSaldo());
                        System.out.println("Quanto você deseja retirar? ");
                        int dindin = verificar.nextInt();
                        if (dindin > getSaldo()) {
                            // Dar continuiadade a partir daqui ainda hoje.
                            System.out.println("Saldo Insuficiente, tente novamente");
                            break;
                        }
                        sacar(dindin);
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saldo restante : " + getSaldo());
                        System.out.println("0 - Voltar                1 - Sair");
                        resp = verificar.nextInt();
                        if (resp == 0) {
                            continue;
                        } else if (resp == 1) {
                            return;
                        }
                        break;

                    case 3:
                        System.out.println(fecharConta());
                        System.out.println("0 - Voltar                1 - Sair");
                        resp = verificar.nextInt();
                        if (resp == 0) {
                            continue;
                        } else if (resp == 1) {
                            return;
                        }
                        break;

                    case 4:
                        System.out.println("Saindo......");
                        start = false;
                        return;

                    default:
                        System.out.println("Opção invalida, tente novamente");
                        break;

                }
            } else {
                return;
            }
        }
    }

    // Escolhendo se é conta poupança ou conta corrente.
    public void tC(String tipo) {
        if (tipo.equals("ContaCorrente")) {
            this.tipoConta = "cC";
        } else if (tipo.equals("ContaPoupanca")) {
            this.tipoConta = "cP";
        } else {
            System.out.println("Operação invalida!");
            System.out.println("Escolha entre ContaPoupanca ou ContaCorrente.");
        }
    }

    public void veriStatus() {
        System.out.println(" ");
        System.out.println("-----------------------");
        System.out.println("____Status da Conta____");
        System.out.println("Dono: " + this.dono);
        System.out.println("N° da conta: " + numConta);
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("Tipo da conta: " + this.tipoConta);
        System.out.println("Status: " + getStatus());
        System.out.println(" ");
        System.out.println("-----------------------");
    }

    public void abrirConta(String status) {
        if (status.equals("S")) {
            this.status = true;
            if (this.tipoConta.equals("cC")) {
                this.saldo = 150;

            } else if (this.tipoConta.equals("cP")) {
                this.saldo = 50;

            }
        }
    }

    public String getStatus() {
        if (status.equals(true)) {
            return "Ativo";
        } else {
            return "Desativado";
        }
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int dinheiro) {
        int saldoAtual = getSaldo();
        setSaldo(saldoAtual + dinheiro);

    }

    public void sacar(int dinheiro) {
        int saldoAtual = getSaldo();
        setSaldo(saldoAtual - dinheiro);
    }

    public String fecharConta() {
        if (this.status) {
            if (this.saldo < 0) {
                return "Você não pode fechar a conta, pois está devendo dinheiro.";
            } else if (this.saldo > 0) {
                return "Você não pode fechar a conta, pois ainda possui saldo.";
            } else if (this.saldo == 0) {
                this.status = false;
                return "Conta Fechada!";
            }
        }
        return " ";
    }
}
