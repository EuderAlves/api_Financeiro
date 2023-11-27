package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.banco.Banco;
import financeiro.tcc.api.repository.BancoRepository;
import financeiro.tcc.api.models.banco.DadosCadastroBanco;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("contasBancarias")
public class ContasBancariasController {

    @Autowired
    private BancoRepository bancoRepository;

    @PostMapping()
    @Transactional
    public void cadastrarContas(@RequestBody @Valid DadosCadastroBanco dadosCadastroBanco) {
       bancoRepository.save(new Banco(dadosCadastroBanco));
    }

    @GetMapping("/{idUser}")
    public Optional<Banco> listarBancoByIdUser(@PathVariable("idUser") Long idUser){
        return bancoRepository.findById(idUser);
    }
}
