package financeiro.tcc.api.models.gastosLazer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosGastosLazer(
        @NotNull
        Long user,

        @NotBlank
        String nome_lazer,

        @NotNull
        Double valor_gast_laz
) {
}
