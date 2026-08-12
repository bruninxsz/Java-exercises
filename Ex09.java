import java.util.Scanner;

public class Ex09 {

    static class Conta {

        Scanner sc = new Scanner(System.in);

        String titular;
        int transacao;
        double valor = 0;
        int saldo = 0;

        void depositar() {
            System.out.println("Quanto você deseja depositar?");
            valor = sc.nextDouble();
            saldo += valor;
            System.out.println("Saldo: " + saldo);
        }

        void sacar() {
            System.out.println("Quanto você deseja sacar?");
            valor = sc.nextInt();
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saldo: " + saldo);
            } else {
                System.out.println("Saldo insuficiente!");
            }

        }

        void escolha() {
            System.out.println("0- Depositar || 1- Sacar || 2- Parar");
            transacao = sc.nextInt();

        }

    }

    static class Main {
        public static void main(String[] args) {
            Conta minhaconta = new Conta();

            minhaconta.titular = "Bruno Henrique";

            while (minhaconta.transacao != 2) {

                minhaconta.escolha();

                if (minhaconta.transacao == 0) {
                    minhaconta.depositar();
                    System.out.println("Deseja fazer outra transação?");
                } else if (minhaconta.transacao == 1) {
                    minhaconta.sacar();
                } else if (minhaconta.transacao == 2) {
                    System.out.println("Você decidiu parar.");
                    return;
                } else {
                    System.out.println("Transação inválida! Selecione novamente:");
                    minhaconta.escolha();
                }
            }

        }
    }
}
