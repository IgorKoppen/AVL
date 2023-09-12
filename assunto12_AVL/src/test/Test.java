package test;

import arvores.AVLint;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        AVLint avLint = new AVLint();
        int opcao, valor;

        do{
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostrar FB dos nos");
            opcao = le.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Encerrando programa!");
                    break;
                case 1:
                    System.out.println("Informe valor: ");
                    valor = le.nextInt();
                    avLint.root = avLint.inserirH(avLint.root,valor);
                    break;
                case 2:
                    System.out.println("Apresentacao FB dos Nos");
                    avLint.mostraFB(avLint.root);
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);
        le.close();

    }
}
