package financeiro.tcc.api.models.contasFixas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosContasFixas(
        @NotNull
        Long id_user,

        @NotBlank
        String nome_conta,

        @NotNull
        Double valor_conta
) {
}
