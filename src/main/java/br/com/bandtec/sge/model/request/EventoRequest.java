package br.com.bandtec.sge.model.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EventoRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
    private String title;
    private String description;
    private String date;
    private int vacancies;
    private int eventStatus;
    private String startTime;
    private String endTime;
    private String background;
    private String local;
    private List<ComentarioEventoRequest> comentarioEventoRequest;
    
    public EventoRequest() {
    	
    	this.id = 0;
    	this.title = "";
    	this.description = "";
    	this.date = "";
    	this.vacancies = 0;
    	this.eventStatus = 0;
    	this.startTime = "";
    	this.endTime = "";
    	this.background = "";
    	this.local = "";
    	this.comentarioEventoRequest = new ArrayList<>();
    }

    public EventoRequest(long id, String title, String description, String date, int vacancies, int eventStatus,
                         String startTime, String endTime, String background, String local, List<ComentarioEventoRequest> comentarioEventoRequest) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.vacancies = vacancies;
        this.eventStatus = eventStatus;
        this.startTime = startTime;
        this.endTime = endTime;
        this.background = background;
        this.local = local;
        this.comentarioEventoRequest = comentarioEventoRequest;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLimitParticipants() {
        return vacancies;
    }

    public void setLimitParticipants(int vacancies) {
        this.vacancies = vacancies;
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

    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    public List<ComentarioEventoRequest> getComentarioEventoRequest() {
        return comentarioEventoRequest;
    }

    public void setComentarioEventoRequest(List<ComentarioEventoRequest> comentarioEventoRequest) {
        this.comentarioEventoRequest = comentarioEventoRequest;
    }
}
