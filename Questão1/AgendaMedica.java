class AgendaMedica {
    String data;
    MarcacaoHorario[] horariosDisponiveis;

    AgendaMedica(String data) {
        this.data = data;
        this.horariosDisponiveis = new MarcacaoHorario[8];
        for (int i = 0; i < 8; i++) {
            this.horariosDisponiveis[i] = new MarcacaoHorario((i + 13) + ":00");
        }
    }

    void agendar(String nomePaciente, String horarioDesejado) {
        for (MarcacaoHorario horario : horariosDisponiveis) {
            if (horario.horario.equals(horarioDesejado) && horario.nomePaciente == null) {
                horario.nomePaciente = nomePaciente;
                System.out.println("Consulta agendada para " + nomePaciente + " às " + horarioDesejado + ".");
                return;
            }
        }
        System.out.println("Erro: Horário " + horarioDesejado + " já está ocupado ou não existe.");
    }

    void verificarHorario(String horarioConsulta) {
        for (MarcacaoHorario horario : horariosDisponiveis) {
            if (horario.horario.equals(horarioConsulta)) {
                if (horario.nomePaciente == null) {
                    System.out.println("Horário " + horarioConsulta + " está livre.");
                } else {
                    System.out.println("Paciente agendado para o horário " + horarioConsulta + ": " + horario.nomePaciente + ".");
                }
                return;
            }
        }
        System.out.println("Erro: Horário " + horarioConsulta + " não encontrado.");
    }

    void verificarPaciente(String nomePaciente) {
        for (MarcacaoHorario horario : horariosDisponiveis) {
            if (horario.nomePaciente != null && horario.nomePaciente.equals(nomePaciente)) {
                System.out.println("Paciente " + nomePaciente + " tem consulta às " + horario.horario + ".");
                return;
            }
        }
        System.out.println("Erro: Paciente " + nomePaciente + " não encontrado.");
    }
}