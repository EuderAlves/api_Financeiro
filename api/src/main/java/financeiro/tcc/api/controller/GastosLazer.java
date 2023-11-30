package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.gastosLazer.AtualizaGastoLazer;
import financeiro.tcc.api.models.gastosLazer.DadosGastosLazer;
import financeiro.tcc.api.models.gastosLazer.GastoLazer;
import financeiro.tcc.api.repository.GastosLazerRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("gastosLazer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GastosLazer {

    @Autowired
    GastosLazerRepository gastosLazerRepository;

    @PostMapping()
    @Transactional
    public void cadastroGastoLazer(@RequestBody @Valid DadosGastosLazer dadosGastosLazer){
        gastosLazerRepository.save(new GastoLazer(dadosGastosLazer));
    }

    @PutMapping
    @Transactional
    public void atualizaGastosLazer(@RequestBody @Valid AtualizaGastoLazer atualizaGastoLazer){
        var gastoLazer= gastosLazerRepository.getReferenceById(atualizaGastoLazer.id());
        gastoLazer.atualizaGastoLazer(atualizaGastoLazer);
    }
    @GetMapping("/{iduser}")
    public List<GastoLazer> listaGastoLazerByIdUser(@PathVariable("idUser") Long idUser) {
        return gastosLazerRepository.findByUser(idUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirGastoLazer(@PathVariable("id") Long id){
        gastosLazerRepository.deleteById(id);
    }
}
