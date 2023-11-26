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
    private Long id_user;
    private String nome_ext_ent;
    private Double valor_ext_ent;
    public ExtraEntradas(DadosExtrasEntrada dadosExtrasEntrada) {

        this.id_user = dadosExtrasEntrada.id_user();
        this.nome_ext_ent = dadosExtrasEntrada.nome_ext_ent();
        this.valor_ext_ent = dadosExtrasEntrada.valor_ext_ent();
    }
}
