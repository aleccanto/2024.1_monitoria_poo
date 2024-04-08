package m06_1;

public interface Agendamento {

	void agendar(TipoAgendamento tipoAgendamento, String descricao);

	void desmarcar(Integer id);

	Evento eventoPorId(Integer id);
	
	void listarAgendamentos();

}
