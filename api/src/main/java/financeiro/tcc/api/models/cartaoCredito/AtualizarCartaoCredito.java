package financeiro.tcc.api.models.cartaoCredito;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizarCartaoCredito(
        @NotNull
        Long id,
        Long user,
        String nome_cartao,
        Double valor_fatura,
        Double valor_total,
        Double limite
) {
}
