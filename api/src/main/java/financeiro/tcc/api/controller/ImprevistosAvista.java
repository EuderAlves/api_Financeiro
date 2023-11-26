package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.imprevistosAvista.DadosImprevistoAvista;
import financeiro.tcc.api.models.imprevistosAvista.Impresvisto;
import financeiro.tcc.api.repository.ImprevistosAvistaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
