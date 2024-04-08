package m06_1;

public class Evento {

	private static Integer proximoId = 1;

	private Integer id;
	private TipoAgendamento tipoAgendamento;
	private String descricao;

	public Evento(TipoAgendamento tipoAgendamento, String descricao) {
		this.id = Evento.proximoId;
		this.tipoAgendamento = tipoAgendamento;
		this.descricao = descricao;

		Evento.proximoId++;
	}

	public Integer getId() {
		return id;
	}

	public TipoAgendamento getTipoAgendamento() {
		return tipoAgendamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Evento: " + id + ", Tipo do agendamento: " + tipoAgendamento + ", descrição: " + descricao;
	}

}
