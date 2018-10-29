package br.com.bandtec.sge.model.query;

public class ComentarioEventoQuery {

    private final String buscarComentarios;


    public ComentarioEventoQuery() {
        this.buscarComentarios = "select B.conteudo as content, A.nome as author, A.foto as img from usuario as A inner join comentario_evento as B on A.id = B.id_usuario where B.id_evento = ?;";
    }

    public String getBuscarComentarios() {
        return buscarComentarios;
    }

}
