package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.cartaoCredito.CartaoDeCredito;
import financeiro.tcc.api.models.cartaoCredito.DadosCartaoCredito;
import financeiro.tcc.api.repository.CartoesCreditoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cartaoCredito")

public class CartoesCredito {

    @Autowired
    CartoesCreditoRepository cartoesCreditoRepository;

    @PostMapping()
    @Transactional
    public void cadatrarCartaoCredito(@RequestBody @Valid DadosCartaoCredito dadosCartaoCredito){
        cartoesCreditoRepository.save(new CartaoDeCredito(dadosCartaoCredito));
    }
}
