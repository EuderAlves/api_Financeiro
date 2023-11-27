package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.cartaoCredito.CartaoDeCredito;
import financeiro.tcc.api.models.cartaoCredito.DadosCartaoCredito;
import financeiro.tcc.api.repository.CartoesCreditoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/{idUser}")
    public Optional<CartaoDeCredito> listarCartoesByIdUser(@PathVariable("idUser") Long idUser){
        return cartoesCreditoRepository.findById(idUser);
    }
}
