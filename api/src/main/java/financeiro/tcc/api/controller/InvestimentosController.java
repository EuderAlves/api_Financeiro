package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.investimento.DadosInvestimento;
import financeiro.tcc.api.models.investimento.Investimento;
import financeiro.tcc.api.repository.InvestimentosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("investimentos")
public class InvestimentosController {

    @Autowired
    InvestimentosRepository investimentosRepository;

    @PostMapping()
    @Transactional
    public void cadastroInvestimento(@RequestBody @Valid DadosInvestimento dadosInvestimento){
        investimentosRepository.save(new Investimento(dadosInvestimento));
    }

    @GetMapping("/{idUser}")
    public Optional<Investimento> listaInvestimentoByIdUser(@PathVariable("idUser") Long idUser) {
        return investimentosRepository.findById(idUser);

    }
}
