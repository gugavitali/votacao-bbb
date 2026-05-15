package me.dio.votacao_bbb_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("votacao")
public class VotacaoModel {

    @Id
    private String id;
    private ParticipanteModel particiopante;
    private Date dataHora;
}
