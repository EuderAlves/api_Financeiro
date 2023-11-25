package financeiro.tcc.api.models.banco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroBanco(

        @NotNull
        Long id,
        @NotBlank
        String nome_banco,
        @NotNull
        Long numero_conta,
        @NotNull
        Long agencia,
        String tipo_conta,
        @NotNull
        Double valor_total_conta) {
}
