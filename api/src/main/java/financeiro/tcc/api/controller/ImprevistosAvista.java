package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.imprevistosAvista.DadosImprevistoAvista;
import financeiro.tcc.api.models.imprevistosAvista.Impresvisto;
import financeiro.tcc.api.repository.ImprevistosAvistaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("imprevistosAvista")
public class ImprevistosAvista {

    @Autowired
    ImprevistosAvistaRepository imprevistosAvistaRepository;

    @PostMapping()
    @Transactional
    public void cadastroImpresvistoAvista(@RequestBody @Valid DadosImprevistoAvista dadosImprevistoAvista){
        imprevistosAvistaRepository.save(new Impresvisto(dadosImprevistoAvista));
    }
    @GetMapping("/{idUser}")
    public Optional<Impresvisto> listaImprevistoByIdUser(@PathVariable("idUser") Long idUser) {
        return imprevistosAvistaRepository.findById(idUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void exlcuirImprevistoAvista(@PathVariable("id") Long id){
        imprevistosAvistaRepository.deleteById(id);
    }
}
