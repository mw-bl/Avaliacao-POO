Avaliacao-POO - S4 Sistemas

Dupla: Marcos Willian Bezerra Lima e Maria Eduarda Clementino Aires

Q1: (3 pts) Em uma clínica médica os pacientes são atendidos por hora marcada. São 8 vagas por dia (de 1h da tarde às 8h da noite) . Crie um algoritmo que simule o sistema de marcação de horários. O sistema deve ter uma classe chamada MarcacaoHorario. Esta classe deve possuir os atributos horário e nome do paciente. Crie também uma classe chamada AgendaMedica.  Essa classe deverá ter um atributo para data e um array do tipo MarcacaoHorario com 8 horários disponíveis. A classe AgendaMedica deve possuir  os seguintes métodos:
- AGENDAR: o sistema solicita o nome do paciente e o horário que ele deseja marcar a consulta. Se o horário já estiver ocupado, uma mensagem de erro deve ser informada.
- VERIFICAR HORÁRIO: Dado o horário da consulta, o sistema deve informar qual paciente está agendado para esse horário ou então informar que o horário está livre, se for esse o caso.
- VERIFICAR PACIENTE: Dado o nome do paciente, o sistema deve informar a hora da sua consulta, ou uma mensagem dizendo que não há consulta marcada para esse paciente.

Q2: (2 pts )Defina em Java uma classe CadastroDeContas, que servirá para armazenar todas as contas bancárias de um Banco utilizando um array. Crie uma classe Conta com os atributos número, saldo e titular. A classe CadastroDeContas deverá ter os seguintes métodos:

- Método cadastrar que receba como parâmetro uma instância da classe Conta e armazene esta conta no cadastro, retornando true caso o armazenamento tenha sido realizado com sucesso, e false caso contrário.
- Método procurar que receba como parâmetro um inteiro com o número da conta e retorne a instância da classe Conta que está armazenada no cadastro caso a encontre e retorne null, caso contrário.
- Método excluir que receba como parâmetro um inteiro com o número da conta, remova-a do cadastro e retorne true caso a encontre, ou retorne false caso a conta não esteja cadastrada.
- Método qtdCadastradas que retorne a quantidade de contas cadastradas atualmente no cadastro. 
