package financeiro.tcc.api.models.banco;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="banco")
@Entity(name="Banco")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Banco {

    @Id
    private Long id_user;
    private String nome_banco;
    private Long numero_conta;
    private Long agencia;
    private String tipo_conta;
    private Double valor_total_conta;

    public Banco(DadosCadastroBanco dadosCadastroBanco) {
        this.id_user=dadosCadastroBanco.id_user();
        this.nome_banco = dadosCadastroBanco.nome_banco();
        this.numero_conta = dadosCadastroBanco.numero_conta();
        this.agencia = dadosCadastroBanco.agencia();
        this.tipo_conta = dadosCadastroBanco.tipo_conta();
        this.valor_total_conta = dadosCadastroBanco.valor_total_conta();
    }
}
