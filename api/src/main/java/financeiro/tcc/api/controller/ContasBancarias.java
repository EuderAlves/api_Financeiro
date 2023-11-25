package financeiro.tcc.api.controller;

import financeiro.tcc.api.banco.Banco;
import financeiro.tcc.api.banco.BancoRepository;
import financeiro.tcc.api.banco.DadosCadastroBanco;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contasBancarias")
public class ContasBancarias {

    @Autowired
    private BancoRepository bancoRepository;

    @PostMapping()
    @Transactional
    public void cadastrarContas(@RequestBody DadosCadastroBanco dadosCadastroBanco) {
       bancoRepository.save(new Banco(dadosCadastroBanco));
    }
}
