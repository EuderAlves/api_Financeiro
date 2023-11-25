package financeiro.tcc.api.models.entradas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosEntradas(
        @NotNull
        Long id_user,

        @NotBlank
        String nome_ent,

        @NotNull
        Long valor_ent
) {
}
