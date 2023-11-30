package financeiro.tcc.api.models.imprevistosAvista;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizarImprevistoAVista(
        @NotNull
        Long id,
        Long user,
        String nome_imprev,
        Double valor_imp_avi
) {
}
