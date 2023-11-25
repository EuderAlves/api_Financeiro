package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.banco.Banco;
import financeiro.tcc.api.repository.BancoRepository;
import financeiro.tcc.api.models.banco.DadosCadastroBanco;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
