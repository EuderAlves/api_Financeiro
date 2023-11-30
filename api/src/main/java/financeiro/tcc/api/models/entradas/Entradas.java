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
    private Long user;
    private String nome_ent;
    private Double valor_ent;


    public Entradas(DadosEntradas dadosEntradas) {
        this.user = dadosEntradas.user();
        this.nome_ent = dadosEntradas.nome_ent();
        this.valor_ent = dadosEntradas.valor_ent();
    }

    public void atualizaEntrada(AtualizarEntradas atualizarEntradas) {
        if(atualizarEntradas.user() != null){
            this.user = atualizarEntradas.user();
        }
        if(atualizarEntradas.nome_ent() != null){
            this.nome_ent = atualizarEntradas.nome_ent();
        }
        if(atualizarEntradas.valor_ent() != null){
            this.valor_ent = atualizarEntradas.valor_ent();
        }
    }
}
