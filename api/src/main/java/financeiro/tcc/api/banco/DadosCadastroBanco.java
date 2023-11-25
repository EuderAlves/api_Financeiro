package financeiro.tcc.api.banco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroBanco(

        @NotBlank
        String nome_banco,
        @NotNull
        Long numero_conta,
        @NotBlank
        Long agencia,
        String tipo_conta,
        @NotNull
        Double valor_total_conta) {
}
