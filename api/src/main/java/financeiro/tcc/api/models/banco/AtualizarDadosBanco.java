package financeiro.tcc.api.models.banco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizarDadosBanco(
        @NotNull
        Long id,
        Long id_user,
        String nome_banco,
        Long numero_conta,
        Long agencia,
        String tipo_conta,
        Double valor_total_conta) {
}
