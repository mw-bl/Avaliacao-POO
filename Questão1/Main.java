import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaMedica agenda = new AgendaMedica("2023-11-14");

        int opcao;
        do {
            System.out.println("Escolha uma opção:\n1. Agendar consulta\n2. Verificar horário\n3. Verificar paciente\n4. Sair");
            System.out.print("\nSua opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("\nNome do paciente: ");
                String nomePaciente = scanner.next();
                System.out.print("Horário desejado (Entre 13:00 e 20:00): ");
                String horarioConsulta = scanner.next();
                agenda.agendar(nomePaciente, horarioConsulta);
            } else if (opcao == 2) {
                System.out.print("Horário da consulta (Entre 13:00 e 20:00): ");
                String horarioConsulta = scanner.next();
                agenda.verificarHorario(horarioConsulta);
            } else if (opcao == 3) {
                System.out.print("Nome do paciente: ");
                String nomePaciente = scanner.next();
                agenda.verificarPaciente(nomePaciente);
            } else if (opcao == 4) {
                System.out.println("Saindo do sistema.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }
}
