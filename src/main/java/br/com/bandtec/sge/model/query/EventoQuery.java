package br.com.bandtec.sge.model.query;

public class EventoQuery {
	
	private final String buscarEventosParaHome;
	
	public EventoQuery() {
		
		this.buscarEventosParaHome = "SELECT titulo AS title, "
				+ "background AS background, "
				+ "descricao AS description FROM evento";
	}

	public String getBuscarEventosParaHome() {
		
		return this.buscarEventosParaHome;
	}

}
