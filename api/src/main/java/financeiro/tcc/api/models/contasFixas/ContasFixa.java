package financeiro.tcc.api.models.contasFixas;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name ="contas_fixas")
@Entity(name="Contas_Fixas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContasFixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user;
    private String nome_conta;
    private Double valor_conta;
    public ContasFixa(@Valid DadosContasFixas dadosContasFixas) {
        this.user = dadosContasFixas.user();
        this.nome_conta = dadosContasFixas.nome_conta();
        this.valor_conta = dadosContasFixas.valor_conta();
    }

    public void atualizarContaFixa(AtualizaContaFixa atualizaContaFixa) {
        if(atualizaContaFixa.user() != null){
            this.user = atualizaContaFixa.user();
        }
        if(atualizaContaFixa.nome_conta() != null){
            this.nome_conta = atualizaContaFixa.nome_conta();
        }
        if(atualizaContaFixa.valor_conta() != null){
            this.valor_conta = atualizaContaFixa.valor_conta();
        }
    }
}
