package br.com.bandtec.sge.repository;

import br.com.bandtec.sge.model.Evento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventoRepository extends CrudRepository<Evento, Long> {

    List<Evento> findAll();

    Evento findById(long id);

    @Query("update Evento evento set evento.eventStatus = :status where evento.id = :id ")
    void cancelarEvento(@Param("id") long id, @Param("status") int status);

}
