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
    private Long id_user;
    private String nome_cartao;
    private Double valor_fatura;
    private Double valor_total;
    private Double limite;
    public CartaoDeCredito(@Valid DadosCartaoCredito dadosCartaoCredito) {

        this.id_user = dadosCartaoCredito.id_user();
        this.nome_cartao = dadosCartaoCredito.nome_cartao();
        this.valor_fatura = dadosCartaoCredito.valor_fatura();
        this.valor_total = dadosCartaoCredito.valor_total();
        this.limite = dadosCartaoCredito.limite();
    }
}
