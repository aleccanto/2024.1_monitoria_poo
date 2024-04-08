package m06_1;

public class Principal {

	public static void main(String[] args) {
		Agendamento agendamento = new Agenda();

		agendamento.agendar(TipoAgendamento.AULA, "Aula de POO.");
		agendamento.agendar(TipoAgendamento.FESTA, "Festa de formatura.");
		agendamento.listarAgendamentos();

		agendamento.desmarcar(1);
		agendamento.listarAgendamentos();

		System.out.println(agendamento.eventoPorId(1));

	}
}
