package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.extrasEntrada.DadosExtrasEntrada;
import financeiro.tcc.api.models.extrasEntrada.ExtraEntradas;
import financeiro.tcc.api.repository.ExtrasEntradaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("extrasEntrada")
public class ExtrasEntrada {

    @Autowired
    ExtrasEntradaRepository extrasEntradaRepository;

    @PostMapping()
    @Transactional
    public void cadastroExtrasEntrada( @RequestBody @Valid DadosExtrasEntrada dadosExtrasEntrada){
        extrasEntradaRepository.save(new ExtraEntradas(dadosExtrasEntrada));
    }
}
