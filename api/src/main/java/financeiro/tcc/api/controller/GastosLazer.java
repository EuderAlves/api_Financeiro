package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.gastosLazer.DadosGastosLazer;
import financeiro.tcc.api.models.gastosLazer.GastoLazer;
import financeiro.tcc.api.repository.GastosLazerRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gastosLazer")
public class GastosLazer {

    @Autowired
    GastosLazerRepository gastosLazerRepository;

    @PostMapping()
    @Transactional
    public void cadastroGastoLazer(@RequestBody @Valid DadosGastosLazer dadosGastosLazer){
        gastosLazerRepository.save(new GastoLazer(dadosGastosLazer));
    }
}
