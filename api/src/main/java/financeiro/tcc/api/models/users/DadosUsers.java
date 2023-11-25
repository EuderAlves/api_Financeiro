package financeiro.tcc.api.models.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosUsers(
        @NotBlank
        String nome,
        @NotBlank
        String sobre_nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String adm,
        Long id_meu_adm

) {
}
