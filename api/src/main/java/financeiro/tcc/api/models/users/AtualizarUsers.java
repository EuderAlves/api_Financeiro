package financeiro.tcc.api.models.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizarUsers(
        @NotNull
        Long id,
        String nome,
        String sobre_nome,
        @NotBlank
        @Email
        String email,
        String adm,
        Long id_meu_adm
) {
}
