package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.imprevistosAvista.AtualizarImprevistoAVista;
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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ImprevistosAvista {

    @Autowired
    ImprevistosAvistaRepository imprevistosAvistaRepository;

    @PostMapping()
    @Transactional
    public void cadastroImpresvistoAvista(@RequestBody @Valid DadosImprevistoAvista dadosImprevistoAvista){
        imprevistosAvistaRepository.save(new Impresvisto(dadosImprevistoAvista));

    }

    @PutMapping()
    @Transactional
    public void atualizarImprevistosAvista(@RequestBody @Valid AtualizarImprevistoAVista atualizarImprevistoAVista){
        var imprevostoAvista = imprevistosAvistaRepository.getReferenceById(atualizarImprevistoAVista.id());
        imprevostoAvista.atualizarImprevisto(atualizarImprevistoAVista);
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
