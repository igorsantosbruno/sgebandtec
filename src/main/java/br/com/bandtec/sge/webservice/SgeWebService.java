package br.com.bandtec.sge.webservice;

import br.com.bandtec.sge.model.Comentario;
import br.com.bandtec.sge.model.Evento;
import br.com.bandtec.sge.model.Participante;
import br.com.bandtec.sge.model.request.EventoRequest;
import br.com.bandtec.sge.repository.ComentarioQueryRepository;
import br.com.bandtec.sge.repository.ComentarioRepository;
import br.com.bandtec.sge.repository.EventoQueryRepository;
import br.com.bandtec.sge.repository.EventoRepository;
import br.com.bandtec.sge.repository.ParticipanteRepository;
import br.com.bandtec.sge.request.SgcRequest;
import br.com.bandtec.sge.util.EventoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/sge")
public class SgeWebService {

    @Autowired
    private EventoRepository eventoRepository;
    
    @Autowired
    private EventoQueryRepository eventoQueryRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Autowired
    private ComentarioQueryRepository comentarioQueryRepository;

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping("/get_evento")
    public EventoRequest getEvento(@RequestParam("id") long id) {

        EventoUtil eventoUtil = new EventoUtil();

        int totalParticipantes = eventoUtil.getTotalParticipantes(this.participanteRepository, id);

        Evento evento = this.eventoRepository.findById(id);
        String[] data = evento.getDate().toString().split("-");
        String dataFormatada = eventoUtil.formatarData(data);

        int vacancies = evento.getLimitParticipants() - totalParticipantes;

        EventoRequest eventoParaEnvio = new EventoRequest(evento.getId(), evento.getTitle(),
                evento.getDescription(), dataFormatada, vacancies, evento.getEventStatus(),
                evento.getStartTime(), evento.getEndTime(), evento.getBackground(), evento.getLocal(), 
                this.comentarioQueryRepository.buscarComentarios(11));

        return eventoParaEnvio;
    }

    @GetMapping("/get_eventos")
    public List<Evento> getEventos() {

        return this.eventoRepository.findAll();
    }

    @PostMapping("/post_evento")
    public void postEvento(@RequestParam("file") MultipartFile file, Evento evento) {

        EventoUtil eventoUtil = new EventoUtil();
        evento.setBackground(eventoUtil.converterBase64(file));
        this.eventoRepository.save(evento);
        SgcRequest sgcRequest = new SgcRequest();
        sgcRequest.postSgcConteudo(0);
    }

    @PostMapping("/post_participante")
    public void postParticipante(Participante participante) {
    	this.participanteRepository.save(participante);
    }

    @PostMapping("/post_cancelar_evento")
    public void postCancelarEvento(long id) {

        Evento eventoParaCancelar = this.eventoRepository.findById(id);
        eventoParaCancelar.setEventStatus(1);
        this.eventoRepository.save(eventoParaCancelar);
    }

    @PostMapping("/post_comentario")
    public void postComentario(Comentario comentario){
    	
    	this.comentarioRepository.save(comentario);
    }
    
    @GetMapping("/get_eventos_para_home")
    public List<Evento> getEventosParaHome() {
    	
    	return this.eventoQueryRepository.buscarEventosParaHome();
    }
}






