package financeiro.tcc.api.models.entradas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizarEntradas(
        @NotNull
        Long id,
        Long id_user,
        String nome_ent,
        Double valor_ent
) {
}
