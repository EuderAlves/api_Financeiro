package financeiro.tcc.api.models.investimento;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "investimentos")
@Entity(name = "Investimentos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user;
    private String nome_invest;
    private Double valor_invest;
    public Investimento(@Valid DadosInvestimento dadosInvestimento) {
        this.user = dadosInvestimento.user();
        this.nome_invest = dadosInvestimento.nome_invest();
        this.valor_invest = dadosInvestimento.valor_invest();
    }

    public void atualiarInvestimento(AtulizaInvestimento atulizaInvestimento) {
        if(atulizaInvestimento.user() != null){
            this.user = atulizaInvestimento.user();
        }
        if(atulizaInvestimento.nome_invest() != null){
            this.nome_invest = atulizaInvestimento.nome_invest();
        }
        if(atulizaInvestimento.valor_invest() != null){
            this.valor_invest = atulizaInvestimento.valor_invest();
        }
    }
}
