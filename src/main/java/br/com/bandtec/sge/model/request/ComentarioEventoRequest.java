package br.com.bandtec.sge.model.request;

import java.io.Serializable;

public class ComentarioEventoRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String author;
    private String content;
    private String img;
    
    public ComentarioEventoRequest() {
    	
    	this.author = "";
    	this.content = "";
    	this.img = "";
    }

    public ComentarioEventoRequest(String author, String content, String img) {
        this.author = author;
        this.content = content;
        this.img = img;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
