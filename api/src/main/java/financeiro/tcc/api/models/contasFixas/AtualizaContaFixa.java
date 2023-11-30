package financeiro.tcc.api.models.contasFixas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizaContaFixa(
        @NotNull
        Long id,
        Long user,
        String nome_conta,
        Double valor_conta
) {
}
