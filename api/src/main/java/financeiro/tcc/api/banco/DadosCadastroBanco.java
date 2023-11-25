package financeiro.tcc.api.banco;

public record DadosCadastroBanco( String nome_banco, Long numero_conta, Long agencia, String tipo_conta,Double valor_total_conta) {
}
