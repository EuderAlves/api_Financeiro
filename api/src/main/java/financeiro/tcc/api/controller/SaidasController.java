package financeiro.tcc.api.controller;

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
public class SaidasController {

    @Autowired
    SaidaRepository saidaRepository;
    @PostMapping()
    @Transactional
    public void cadrastarSaidas(@RequestBody @Valid DadosSaida dadosSaida){
        saidaRepository.save(new Saida(dadosSaida));

    }

    @GetMapping("/{idUser}")
    public Optional<Saida> listaSaidaByIdUser(@PathVariable("idUser") Long idUser) {
        return saidaRepository.findById(idUser);
    }
}
