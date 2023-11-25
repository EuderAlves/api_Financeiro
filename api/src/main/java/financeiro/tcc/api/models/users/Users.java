package financeiro.tcc.api.models.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="users")
@Entity(name="Users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Users {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobre_nome;
    private String email;
    private String adm;
    private Long id_meu_adm;

    public  Users(DadosUsers dadosUsers){
        this.nome = dadosUsers.nome();
        this.sobre_nome = dadosUsers.sobre_nome();
        this.email = dadosUsers.email();
        this.adm = dadosUsers.adm();
        this.id_meu_adm = dadosUsers.id_meu_adm();
    }

}
