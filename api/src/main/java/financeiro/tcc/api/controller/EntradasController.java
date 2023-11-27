package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.entradas.DadosEntradas;
import financeiro.tcc.api.models.entradas.Entradas;
import financeiro.tcc.api.repository.EntradasRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("entradas")
public class EntradasController {

    @Autowired
    private EntradasRepository entradasRepository;
    @PostMapping()
    @Transactional
    public void cadastrarEntradas(@RequestBody @Valid DadosEntradas dadosEntradas){
        entradasRepository.save(new Entradas(dadosEntradas));

    }

    @GetMapping("/{idUser}")
    public Optional<Entradas> listarEntrdasById(@PathVariable("idUser") Long idUser) {
        return entradasRepository.findById(idUser);
    }

}
