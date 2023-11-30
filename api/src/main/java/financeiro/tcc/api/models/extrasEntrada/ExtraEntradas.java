package financeiro.tcc.api.models.extrasEntrada;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "extras_entradas")
@Entity(name = "Extras_Entradas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ExtraEntradas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user;
    private String nome_ext_ent;
    private Double valor_ext_ent;
    public ExtraEntradas(DadosExtrasEntrada dadosExtrasEntrada) {

        this.user = dadosExtrasEntrada.user();
        this.nome_ext_ent = dadosExtrasEntrada.nome_ext_ent();
        this.valor_ext_ent = dadosExtrasEntrada.valor_ext_ent();
    }

    public void atualizaExtraEntrada(AtualizarExtraEntradas atualizarExtraEntradas) {
        if(atualizarExtraEntradas.user() != null){
            this.user = atualizarExtraEntradas.user();
        }
        if(atualizarExtraEntradas.nome_ext_ent() != null){
            this.nome_ext_ent = atualizarExtraEntradas.nome_ext_ent();
        }
        if(atualizarExtraEntradas.valor_ext_ent() != null){
            this.valor_ext_ent = atualizarExtraEntradas.valor_ext_ent();
        }
    }
}
