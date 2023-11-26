package financeiro.tcc.api.models.imprevistosAvista;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosImprevistoAvista(
        @NotNull
        Long id_user,

        @NotBlank
        String nome_imprev,

        @NotNull
        Double valor_imp_avi
) {
}
