package financeiro.tcc.api.models.investimento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosInvestimento(

        @NotNull
        Long user,

        @NotBlank
        String nome_invest,

        @NotNull
        Double valor_invest
) {
}
