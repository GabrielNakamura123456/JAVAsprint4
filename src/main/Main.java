package main;

import controllers.AlertaController;
import controllers.NotificacaoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AlertaController alertaController= new AlertaController();
        NotificacaoController notificacaoController= new NotificacaoController();
        String escolha;

        do {
            System.out.println("Menu:");
            System.out.println("1-Registrar Alerta:");
            System.out.println("2-Consultar Alerta");
            System.out.println("3-Configurar Notificação");
            System.out.println("4-Consultar Notificacoes");
            System.out.println("5-Sair");
            System.out.println("Escolha uma das opções:");
            escolha = scanner.nextLine();

            switch(escolha) {
                case "1":
                    System.out.println("Digite a descrição do alerta:");
                    String descricao= scanner.nextLine();
                    alertaController.criarAlerta(descricao);
                    break;

                case "2":
                    alertaController.listarAlertas();
                    break;

                case "3":
                    System.out.println("Escolher o metodo de notificacao (APP, E-mail");
                    String metodo = scanner.nextLine();
                    notificacaoController.configurarNotificacao(metodo);
                    break;

                case "4":
                    notificacaoController.consultarNotificacao();
                    break;

                case "5":
                    System.out.println("Saindo do sistema. ");
                    break;

                default:
                    System.out.println("Opção inválida.Por favor tente novamente");
            }
        } while (!escolha.equals("5"));

          scanner.close();

    }
}