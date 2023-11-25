package financeiro.tcc.api.models.entradas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="entradas")
@Entity(name="Entradas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Entradas {

    @Id
    private Long id_user;
    private String nome_ent;
    private Long valor_ent;


    public Entradas(DadosEntradas dadosEntradas) {
        this.id_user = dadosEntradas.id_user();
        this.nome_ent = dadosEntradas.nome_ent();
        this.valor_ent = dadosEntradas.valor_ent();
    }
}
