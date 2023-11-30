package financeiro.tcc.api.models.saida;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizaSaidas(
        @NotNull
        Long id,
        Long user,
        String nome_said,
        Double valor_said
) {
}
