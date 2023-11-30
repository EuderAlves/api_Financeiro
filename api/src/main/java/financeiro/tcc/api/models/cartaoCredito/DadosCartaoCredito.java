package financeiro.tcc.api.models.cartaoCredito;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCartaoCredito(

        @NotNull
        Long user,
        @NotBlank
        String nome_cartao,

        @NotNull
        Double valor_fatura,

        @NotNull
        Double valor_total,

        @NotNull
        Double limite
) {
}
