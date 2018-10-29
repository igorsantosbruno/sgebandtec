package br.com.bandtec.sge.util;

import br.com.bandtec.sge.repository.ParticipanteRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public class EventoUtil {

    public String converterBase64(MultipartFile imagem) {

        String strImg = "";

        try {
            strImg = Base64.encodeBase64String(imagem.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return strImg;

    }

    public int getTotalParticipantes(ParticipanteRepository participanteRepository, long eventId) {
        return participanteRepository.buscarIdUsuarios(eventId).length;
    }

    public String formatarData(String[] data) {

        String mes = data[1];
        String dia = data[2];

        String[] meses = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro",
        };

        mes = meses[Integer.parseInt(mes) - 1];

        return dia+" "+mes;
    }
}
