package financeiro.tcc.api.models.extrasEntrada;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizarExtraEntradas(
        @NotNull
        Long id,
        Long id_user,
        String nome_ext_ent,
        Double valor_ext_ent
) {
}
