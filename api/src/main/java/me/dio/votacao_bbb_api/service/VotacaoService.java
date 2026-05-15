package me.dio.votacao_bbb_api.service;

import lombok.AllArgsConstructor;
import me.dio.votacao_bbb_api.model.ParticipanteModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VotacaoService {

    private static final String TOPICO_VOTACAO = "votacao";

    private final KafkaTemplate<Object, Object> template;

    public void adicionarEvento(ParticipanteModel participante){
        template.send(TOPICO_VOTACAO, participante);
    }
}
