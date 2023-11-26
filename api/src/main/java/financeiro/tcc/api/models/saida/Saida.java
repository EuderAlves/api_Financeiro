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
    private Long id_user;
    private String nome_said;
    private Double valor_said;

    public Saida(DadosSaida dadosSaida) {
        this.id_user = dadosSaida.id_user();
        this.nome_said = dadosSaida.nome_said();
        this.valor_said = dadosSaida.valor_said();
    }
}
