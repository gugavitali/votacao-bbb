package me.dio.votacao_bbb_api.repository;

import me.dio.votacao_bbb_api.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametroRepository extends MongoRepository<ParametroModel, String> {
}
