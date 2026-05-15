package me.dio.votacao_bbb_api.controller;

import lombok.AllArgsConstructor;
import me.dio.votacao_bbb_api.model.ParticipanteModel;
import me.dio.votacao_bbb_api.repository.ParticipanteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/participantes")
@AllArgsConstructor
public class ParticipanteController {

    private final ParticipanteRepository participanteRepository;

    @PostMapping("/salvar")
    public ResponseEntity<ParticipanteModel> salvar(@RequestBody ParticipanteModel participante){
        ParticipanteModel entidade = participanteRepository.save(participante);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParticipanteModel> consulta(@RequestParam String chave){
        Optional<ParticipanteModel> opt = participanteRepository.findById(chave);
        return opt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
