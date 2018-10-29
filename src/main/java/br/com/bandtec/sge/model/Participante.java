package br.com.bandtec.sge.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "participante_evento")
@Entity(name = "Participante")

public class Participante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "id_usuario")
	private long participantId;

	@Column(name = "id_evento")
	private long eventId;

    public Participante() {
    	
    	this.id = 0;
    	this.participantId = 0;
    	this.eventId = 0;
    }

    public Participante(long participantId, long eventId) {
        this.participantId = participantId;
        this.eventId = eventId;
    }

    public long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(long participantId) {
        this.participantId = participantId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }
}
