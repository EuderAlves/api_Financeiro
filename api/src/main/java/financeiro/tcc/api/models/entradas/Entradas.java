package financeiro.tcc.api.models.entradas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="entradas")
@Entity(name="Entradas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Entradas {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_user;
    private String nome_ent;
    private Double valor_ent;


    public Entradas(DadosEntradas dadosEntradas) {
        this.id_user = dadosEntradas.id_user();
        this.nome_ent = dadosEntradas.nome_ent();
        this.valor_ent = dadosEntradas.valor_ent();
    }
}
