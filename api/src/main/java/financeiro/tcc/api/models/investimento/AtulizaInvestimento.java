package financeiro.tcc.api.models.investimento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtulizaInvestimento(
        @NotNull
        Long id,
        Long id_user,
        String nome_invest,
        Double valor_invest
) {
}
