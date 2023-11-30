package financeiro.tcc.api.models.imprevistosAvista;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="imprevistos_avista")
@Entity(name="Imprevistos_Avista")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Impresvisto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user;
    private String nome_imprev;
    private Double valor_imp_avi;
    public Impresvisto(@Valid DadosImprevistoAvista dadosImprevistoAvista) {

        this.user = dadosImprevistoAvista.user();
        this.nome_imprev = dadosImprevistoAvista.nome_imprev();
        this.valor_imp_avi = dadosImprevistoAvista.valor_imp_avi();
    }

    public void atualizarImprevisto(AtualizarImprevistoAVista atualizarImprevistoAVista) {
        if(atualizarImprevistoAVista.user() != null){
            this.user = atualizarImprevistoAVista.user();
        }
        if(atualizarImprevistoAVista.nome_imprev() != null){
            this.nome_imprev = atualizarImprevistoAVista.nome_imprev();
        }
        if(atualizarImprevistoAVista.valor_imp_avi() != null){
            this.valor_imp_avi = atualizarImprevistoAVista.valor_imp_avi();
        }
    }
}
