package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.entradas.AtualizarEntradas;
import financeiro.tcc.api.models.entradas.DadosEntradas;
import financeiro.tcc.api.models.entradas.Entradas;
import financeiro.tcc.api.repository.EntradasRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("entradas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EntradasController {

    @Autowired
    private EntradasRepository entradasRepository;
    @PostMapping()
    @Transactional
    public void cadastrarEntradas(@RequestBody @Valid DadosEntradas dadosEntradas){
        entradasRepository.save(new Entradas(dadosEntradas));

    }

    @PutMapping()
    @Transactional
    public void atualizarEntrada(@RequestBody @Valid AtualizarEntradas atualizarEntradas){
        var  entradas = entradasRepository.getReferenceById(atualizarEntradas.id());
        entradas.atualizaEntrada(atualizarEntradas);
    }
    @GetMapping("/{idUser}")
    public List<Entradas> listarEntrdasById(@PathVariable("idUser") Long idUser) {
        return entradasRepository.findByUser(idUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirEntrada(@PathVariable("id") Long id){
        entradasRepository.deleteById(id);
    }

}
