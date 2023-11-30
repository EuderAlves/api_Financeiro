package financeiro.tcc.api.models.saida;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "saidas")
@Entity(name = "Saidas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Saida {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user;
    private String nome_said;
    private Double valor_said;

    public Saida(DadosSaida dadosSaida) {
        this.user = dadosSaida.user();
        this.nome_said = dadosSaida.nome_said();
        this.valor_said = dadosSaida.valor_said();
    }

    public void atualizaSaida(AtualizaSaidas atualizaSaidas) {
        if(atualizaSaidas.user() != null){
            this.user = atualizaSaidas.user();
        }
        if(atualizaSaidas.nome_said() != null){
            this.nome_said = atualizaSaidas.nome_said();
        }
        if(atualizaSaidas.valor_said() != null){
            this.valor_said = atualizaSaidas.valor_said();
        }
    }
}
