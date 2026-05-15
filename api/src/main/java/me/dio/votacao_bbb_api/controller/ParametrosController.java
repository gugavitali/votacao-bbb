package me.dio.votacao_bbb_api.controller;

import me.dio.votacao_bbb_api.model.ParametroModel;
import me.dio.votacao_bbb_api.repository.ParametroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametros")
public class ParametrosController {

    private final ParametroRepository parametroRepository;

    public ParametrosController(ParametroRepository parametroRepository) {
        this.parametroRepository = parametroRepository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<ParametroModel> salvar(@RequestBody ParametroModel parametro){
        ParametroModel entidade = parametroRepository.save(parametro);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParametroModel> consulta(@RequestParam String chave){
        Optional<ParametroModel> optParametro = parametroRepository.findById(chave);
        if (optParametro.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optParametro.get());
    }
}
