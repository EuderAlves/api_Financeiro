package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.contasFixas.ContasFixa;
import financeiro.tcc.api.models.contasFixas.DadosContasFixas;
import financeiro.tcc.api.repository.ContasFixasRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contasFixas")
public class ContasFixasController {

    @Autowired
    ContasFixasRepository contasFixasRepository;

    @PostMapping()
    @Transactional
    public void cadastrarContasFixas(@RequestBody @Valid DadosContasFixas dadosContasFixas){
        contasFixasRepository.save(new ContasFixa(dadosContasFixas));
    }
}
