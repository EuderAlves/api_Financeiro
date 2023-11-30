package financeiro.tcc.api.models.cartaoCredito;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="cartoes_credito")
@Entity(name="Cartoes_Credito")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CartaoDeCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user;
    private String nome_cartao;
    private Double valor_fatura;
    private Double valor_total;
    private Double limite;
    public CartaoDeCredito(@Valid DadosCartaoCredito dadosCartaoCredito) {

        this.user = dadosCartaoCredito.user();
        this.nome_cartao = dadosCartaoCredito.nome_cartao();
        this.valor_fatura = dadosCartaoCredito.valor_fatura();
        this.valor_total = dadosCartaoCredito.valor_total();
        this.limite = dadosCartaoCredito.limite();
    }

    public void atualizaCartaoCredito(AtualizarCartaoCredito atualizarCartaoCredito) {
        if(atualizarCartaoCredito.user() != null){
            this.user = atualizarCartaoCredito.user();
        }
        if(atualizarCartaoCredito.nome_cartao() != null){
            this.nome_cartao = atualizarCartaoCredito.nome_cartao();
        }
        if(atualizarCartaoCredito.valor_fatura() != null){
            this.valor_fatura = atualizarCartaoCredito.valor_fatura();
        }
        if(atualizarCartaoCredito.valor_total() != null){
            this.valor_total = atualizarCartaoCredito.valor_total();
        }
        if(atualizarCartaoCredito.limite() != null){
            this.limite = atualizarCartaoCredito.limite();
        }
    }
}
