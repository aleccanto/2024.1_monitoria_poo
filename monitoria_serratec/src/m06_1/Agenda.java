package m06_1;

import java.util.ArrayList;
import java.util.List;

public class Agenda implements Agendamento {

	private List<Evento> eventos;

	public Agenda() {
		this.eventos = new ArrayList<>();
	}

	@Override
	public void agendar(TipoAgendamento tipoAgendamento, String descricao) {
		Evento evento = new Evento(tipoAgendamento, descricao);
		eventos.add(evento);
	}

	@Override
	public void desmarcar(Integer id) {
		eventos.remove(id - 1);
	}

	@Override
	public Evento eventoPorId(Integer id) {
		return eventos.get(id - 1);
	}

	@Override
	public void listarAgendamentos() {
		System.out.println("Agendamentos");
		for (int i = 0; i < eventos.size(); i++) {
			System.out.println(eventos.get(i));
		}
	}
}
