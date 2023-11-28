package financeiro.tcc.api.models.gastosLazer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizaGastoLazer(
        @NotNull
        Long id,
        Long id_user,
        String nome_lazer,
        Double valor_gast_laz
) {
}
