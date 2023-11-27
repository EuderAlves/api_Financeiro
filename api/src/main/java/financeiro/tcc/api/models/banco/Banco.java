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

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public void atualizaDadosBanco(AtualizarDadosBanco atualizarDadosBanco) {
        if(atualizarDadosBanco.id_user() != null){
            this.id_user=atualizarDadosBanco.id_user();
        }
        if(atualizarDadosBanco.nome_banco() != null){
            this.nome_banco = atualizarDadosBanco.nome_banco();
        }
        if(atualizarDadosBanco.numero_conta() != null){
            this.numero_conta = atualizarDadosBanco.numero_conta();
        }
        if(atualizarDadosBanco.agencia() != null){
            this.agencia = atualizarDadosBanco.agencia();
        }
        if(atualizarDadosBanco.tipo_conta() != null){
            this.tipo_conta = atualizarDadosBanco.tipo_conta();
        }
        if(atualizarDadosBanco.valor_total_conta() != null){
            this.valor_total_conta = atualizarDadosBanco.valor_total_conta();
        }

    }
}
