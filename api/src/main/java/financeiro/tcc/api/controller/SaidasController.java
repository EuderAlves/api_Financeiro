package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.saida.AtualizaSaidas;
import financeiro.tcc.api.models.saida.DadosSaida;
import financeiro.tcc.api.models.saida.Saida;
import financeiro.tcc.api.repository.SaidaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("saidas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SaidasController {

    @Autowired
    SaidaRepository saidaRepository;
    @PostMapping()
    @Transactional
    public void cadrastarSaidas(@RequestBody @Valid DadosSaida dadosSaida){
        saidaRepository.save(new Saida(dadosSaida));
    }

    @PutMapping
    @Transactional
    public void atualuzarSaidas(@RequestBody @Valid AtualizaSaidas atualizaSaidas){
        var saida = saidaRepository.getReferenceById(atualizaSaidas.id());
        saida.atualizaSaida(atualizaSaidas);
    }
    @GetMapping("/{idUser}")
    public Optional<Saida> listaSaidaByIdUser(@PathVariable("idUser") Long idUser) {
        return saidaRepository.findById(idUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirSaida(@PathVariable("id") Long id) {
        saidaRepository.deleteById(id);
    }
}
