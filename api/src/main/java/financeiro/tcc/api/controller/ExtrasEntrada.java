package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.extrasEntrada.DadosExtrasEntrada;
import financeiro.tcc.api.models.extrasEntrada.ExtraEntradas;
import financeiro.tcc.api.repository.ExtrasEntradaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/{iduser}")
    public Optional<ExtraEntradas> listaExtrasEntradaByIdUser(@PathVariable("iduser") Long idUser) {
        return extrasEntradaRepository.findById(idUser);
    }
}
