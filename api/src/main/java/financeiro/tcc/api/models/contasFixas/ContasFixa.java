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
    private Long id_user;
    private String nome_conta;
    private Double valor_conta;
    public ContasFixa(@Valid DadosContasFixas dadosContasFixas) {
        this.id_user = dadosContasFixas.id_user();
        this.nome_conta = dadosContasFixas.nome_conta();
        this.valor_conta = dadosContasFixas.valor_conta();
    }

    public void atualizarContaFixa(AtualizaContaFixa atualizaContaFixa) {
        if(atualizaContaFixa.id_user() != null){
            this.id_user = atualizaContaFixa.id_user();
        }
        if(atualizaContaFixa.nome_conta() != null){
            this.nome_conta = atualizaContaFixa.nome_conta();
        }
        if(atualizaContaFixa.valor_conta() != null){
            this.valor_conta = atualizaContaFixa.valor_conta();
        }
    }
}
