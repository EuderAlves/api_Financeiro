package financeiro.tcc.api.models.entradas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosEntradas(
        @NotNull
        Long user,

        @NotBlank
        String nome_ent,

        @NotNull
        Double valor_ent
) {
}
