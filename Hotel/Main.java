package Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bem_vindo a recepção!");
        System.out.println("Insira a Data em Dia/Mês/Ano: ");
        String[] chkIn = scn.next().split("/");
        System.out.println("Até quando planeja ficar? Dia/Mês/Ano. ");
        String[] chkOut = scn.next().split("/");

        int diaIn = Integer.parseInt(chkIn[0]);
        int mesIn = Integer.parseInt(chkIn[1]);
        int anoIn = Integer.parseInt(chkIn[2]);

        int diaOut = Integer.parseInt(chkOut[0]);
        int mesOut = Integer.parseInt(chkOut[1]);
        int anoOut = Integer.parseInt(chkOut[2]);

        Service Hospede = new Service(diaIn, mesIn, anoIn, diaOut, mesOut, anoOut);
        scn.close();
    }
}
