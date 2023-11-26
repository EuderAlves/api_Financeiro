package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.saida.DadosSaida;
import financeiro.tcc.api.models.saida.Saida;
import financeiro.tcc.api.repository.SaidaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
