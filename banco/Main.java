package banco;

import java.util.Scanner;

import interfacebanco.Interface;

public class Main {
    public static void main(String[] args) {
        Scanner verificar = new Scanner(System.in);
        Interface Login = new Interface();

        Boolean start = false;

        System.out.println("Nome: ");
        String dono = verificar.next();

        System.out.println("Tipo da conta que você deseja? ContaPoupanca ou ContaCorrente?");
        String tipo = verificar.next();

        System.out.println("______________________________");

        System.out.println("Você deseja abrir a conta? [S/N]");
        String status = verificar.next();

        if (status.equals("S")) {
            Service cliente = new Service(dono, tipo);
            cliente.abrirConta(status);
            start = true;
            // routes.menu()

            cliente.menu(start);

        } else if (status.equals("N")) {
            System.out.println("Até mais, você é sempre bem vind# ");
            verificar.close();
            return;
        } else {
            System.out.println("Digite S para sim ou N para não");
            verificar.close();
            return;
        }

        verificar.close();
    }
}