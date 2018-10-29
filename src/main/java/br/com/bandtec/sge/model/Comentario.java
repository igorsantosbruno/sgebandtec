package br.com.bandtec.sge.model;


import java.io.Serializable;

import javax.persistence.*;

@Table(name="comentario_evento")
@Entity(name="Comentario")
public class Comentario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="id_usuario")
    private long userId;

    @Column(name="id_evento")
    private long eventId;

    @Column(name="conteudo")
    private String content;

    public Comentario(){
    	
    	this.id = 0;
    	this.userId = 0;
    	this.eventId = 0;
    	this.content = "";
    }

    public Comentario(long userId, long eventId, String content) {
        this.userId = userId;
        this.eventId = eventId;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
