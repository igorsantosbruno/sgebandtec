package br.com.bandtec.sge.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.bandtec.sge.model.Evento;
import br.com.bandtec.sge.model.query.EventoQuery;

@Repository
public class EventoQueryRepository {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Evento> buscarEventosParaHome () {

        EventoQuery eventoQuery = new EventoQuery();

        return jdbcTemplate.query(eventoQuery.getBuscarEventosParaHome(),
                new BeanPropertyRowMapper<Evento>(Evento.class));
    }

}
