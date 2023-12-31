package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.extrasEntrada.AtualizarExtraEntradas;
import financeiro.tcc.api.models.extrasEntrada.DadosExtrasEntrada;
import financeiro.tcc.api.models.extrasEntrada.ExtraEntradas;
import financeiro.tcc.api.repository.ExtrasEntradaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("extrasEntrada")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExtrasEntrada {

    @Autowired
    ExtrasEntradaRepository extrasEntradaRepository;

    @PostMapping()
    @Transactional
    public void cadastroExtrasEntrada( @RequestBody @Valid DadosExtrasEntrada dadosExtrasEntrada){
        extrasEntradaRepository.save(new ExtraEntradas(dadosExtrasEntrada));
    }

    @PutMapping()
    @Transactional
    public void atualizaExtraEntradas(@RequestBody @Valid AtualizarExtraEntradas atualizarExtraEntradas){
        var extraEntrada = extrasEntradaRepository.getReferenceById(atualizarExtraEntradas.id());
        extraEntrada.atualizaExtraEntrada(atualizarExtraEntradas);

    }

    @GetMapping("/{iduser}")
    public List<ExtraEntradas> listaExtrasEntradaByIdUser(@PathVariable("iduser") Long idUser) {
        return extrasEntradaRepository.findByUser(idUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void exluirExtraEntrada(@PathVariable("id") Long id){
        extrasEntradaRepository.deleteById(id);
    }
}
