package financeiro.tcc.api.models.gastosLazer;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name ="gastos_lazer")
@Entity(name="Gastos_Lazer")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class GastoLazer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_user;
    private String nome_lazer;
    private Double valor_gast_laz;
    public GastoLazer(@Valid DadosGastosLazer dadosGastosLazer) {

        this.id_user = dadosGastosLazer.id_user();
        this.nome_lazer = dadosGastosLazer.nome_lazer();
        this.valor_gast_laz = dadosGastosLazer.valor_gast_laz();
    }

    public void atualizaGastoLazer(AtualizaGastoLazer atualizaGastoLazer) {
        if(atualizaGastoLazer.id_user() != null){
            this.id_user = atualizaGastoLazer.id_user();
        }
        if(atualizaGastoLazer.nome_lazer() != null){
            this.nome_lazer = atualizaGastoLazer.nome_lazer();
        }
        if(atualizaGastoLazer.valor_gast_laz() != null){
            this.valor_gast_laz = atualizaGastoLazer.valor_gast_laz();
        }
    }
}
