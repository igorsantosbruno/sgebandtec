package br.com.bandtec.sge.repository;

import br.com.bandtec.sge.model.query.ComentarioEventoQuery;
import br.com.bandtec.sge.model.request.ComentarioEventoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComentarioQueryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ComentarioEventoRequest> buscarComentarios (long idEvento ){

        ComentarioEventoQuery comentarioEventoQuery = new ComentarioEventoQuery();

        return jdbcTemplate.query(comentarioEventoQuery.getBuscarComentarios(),
                new BeanPropertyRowMapper<ComentarioEventoRequest>(ComentarioEventoRequest.class), idEvento);
    }

}
