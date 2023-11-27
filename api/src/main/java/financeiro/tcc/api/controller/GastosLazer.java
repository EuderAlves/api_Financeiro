package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.gastosLazer.DadosGastosLazer;
import financeiro.tcc.api.models.gastosLazer.GastoLazer;
import financeiro.tcc.api.repository.GastosLazerRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/{iduser}")
    public Optional<GastoLazer> listaGastoLazerByIdUser(@PathVariable("idUser") Long idUser) {
        return gastosLazerRepository.findById(idUser);
    }
}
