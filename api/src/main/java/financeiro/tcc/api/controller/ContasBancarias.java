package financeiro.tcc.api.controller;

import financeiro.tcc.api.banco.DadosCadastroBanco;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contasBancarias")
public class ContasBancarias {

    @PostMapping()
    public void cadastrarContas(@RequestBody DadosCadastroBanco dadosCadastroBanco) {
        System.out.println((dadosCadastroBanco));
    }
}
