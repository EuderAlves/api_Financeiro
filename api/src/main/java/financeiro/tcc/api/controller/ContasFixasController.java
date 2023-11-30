package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.contasFixas.AtualizaContaFixa;
import financeiro.tcc.api.models.contasFixas.ContasFixa;
import financeiro.tcc.api.models.contasFixas.DadosContasFixas;
import financeiro.tcc.api.repository.ContasFixasRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("contasFixas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContasFixasController {

    @Autowired
    ContasFixasRepository contasFixasRepository;

    @PostMapping()
    @Transactional
    public void cadastrarContasFixas(@RequestBody @Valid DadosContasFixas dadosContasFixas){
        contasFixasRepository.save(new ContasFixa(dadosContasFixas));
    }

    @PutMapping()
    @Transactional
    public void atualizarContasFixas(@RequestBody @Valid AtualizaContaFixa atualizaContaFixa){
        var contaFixa = contasFixasRepository.getReferenceById(atualizaContaFixa.id());
        contaFixa.atualizarContaFixa(atualizaContaFixa);

    }
    @GetMapping("/{idUser}")
    public List<ContasFixa> listaContasFixasByIdUser(@PathVariable("idUser") Long idUser){
        return contasFixasRepository.findByUser(idUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirContaFixa(@PathVariable("id") Long id){
        contasFixasRepository.deleteById(id);
    }
}
