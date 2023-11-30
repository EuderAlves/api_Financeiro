package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.cartaoCredito.AtualizarCartaoCredito;
import financeiro.tcc.api.models.cartaoCredito.CartaoDeCredito;
import financeiro.tcc.api.models.cartaoCredito.DadosCartaoCredito;
import financeiro.tcc.api.repository.CartoesCreditoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cartaoCredito")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CartoesCredito {

    @Autowired
    CartoesCreditoRepository cartoesCreditoRepository;

    @PostMapping()
    @Transactional
    public void cadatrarCartaoCredito(@RequestBody @Valid DadosCartaoCredito dadosCartaoCredito){
        cartoesCreditoRepository.save(new CartaoDeCredito(dadosCartaoCredito));
    }

    @PutMapping()
    @Transactional
    public void atualizarCartaoCredito(@RequestBody @Valid AtualizarCartaoCredito atualizarCartaoCredito){
        var cartaoCredito = cartoesCreditoRepository.getReferenceById(atualizarCartaoCredito.id());
        cartaoCredito.atualizaCartaoCredito(atualizarCartaoCredito);
    }
    @GetMapping("/{idUser}")
    public List<CartaoDeCredito> listarCartoesByIdUser(@PathVariable("idUser") Long idUser){
        return cartoesCreditoRepository.findByUser(idUser);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirCartoesCredito(@PathVariable("id") Long id){
        cartoesCreditoRepository.deleteById(id);
    }
}
