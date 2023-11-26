package financeiro.tcc.api.models.saida;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosSaida(
        @NotNull
        Long id_user,

        @NotBlank
        String nome_said,

        @NotNull
        Double valor_said
) {
}
