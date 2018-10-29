package br.com.bandtec.sge.model;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Table(name = "evento")
@Entity(name = "Evento")
public class Evento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "titulo")
	private String title;

	@Column(name = "descricao")
	private String description;

	@Column(name = "data_evento")
	private Date date;

	@Column(name = "limite_participante")
	private int limitParticipants;

	@Column(name = "status_evento")
	private int eventStatus;
	
	@Column(name="hora_incial")
	private String startTime;
	
	@Column(name="hora_final")
	private String endTime;
	
	@Column(name="background")
	private String background;
	
	@Column(name="local_evento")
	private String local;

	public Evento() {
		
		this.id = 0;
		this.title = "";
		this.description = "";
		this.date = new Date(0);
		this.limitParticipants = 0;
		this.eventStatus = 0;
		this.startTime = "";
		this.endTime = "";
		this.background = "";
		this.local = "";
	}

	public Evento(String title, String description, Date date, int limitParticipants, int eventStatus,
			int guestReleased, String startTime, String endTime, String background, String local) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.limitParticipants = limitParticipants;
		this.eventStatus = eventStatus;
		this.startTime = startTime;
		this.endTime = endTime;
		this.background = background;
		this.local = local;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getLimitParticipants() {
		return limitParticipants;
	}

	public void setLimitParticipants(int limitParticipants) {
		this.limitParticipants = limitParticipants;
	}

	public int getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(int eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	

}
