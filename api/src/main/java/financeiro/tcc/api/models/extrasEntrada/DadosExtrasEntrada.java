package financeiro.tcc.api.models.extrasEntrada;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosExtrasEntrada(
        @NotNull
        Long id_user,
        @NotBlank
        String nome_ext_ent,
        @NotNull
        Double valor_ext_ent
) {
}
