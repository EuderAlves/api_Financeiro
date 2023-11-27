package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.contasFixas.ContasFixa;
import financeiro.tcc.api.models.contasFixas.DadosContasFixas;
import financeiro.tcc.api.repository.ContasFixasRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/{idUser}")
    public Optional<ContasFixa> listaContasFixasByIdUser(@PathVariable("idUser") Long idUser){
        return contasFixasRepository.findById(idUser);
    }
}
