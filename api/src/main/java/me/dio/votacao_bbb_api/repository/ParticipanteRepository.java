package me.dio.votacao_bbb_api.repository;

import me.dio.votacao_bbb_api.model.ParticipanteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipanteRepository extends MongoRepository<ParticipanteModel, String> {
}
