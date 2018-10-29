package br.com.bandtec.sge.repository;

import br.com.bandtec.sge.model.Participante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ParticipanteRepository extends CrudRepository<Participante,Long> {

    @Query("select p.participantId from Participante p where p.eventId = :idEvento")
    int [] buscarIdUsuarios(@Param("idEvento")long idEvento);

}
