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

    public void atualizarUser(AtualizarUsers atualizarUsers) {
        if(atualizarUsers.nome() != null){
            this.nome = atualizarUsers.nome();
        }
        if(atualizarUsers.sobre_nome() != null){
            this.sobre_nome = atualizarUsers.sobre_nome();
        }
        if(atualizarUsers.email() != null){
            this.email = atualizarUsers.email();
        }
        if(atualizarUsers.adm() != null){
            this.adm = atualizarUsers.adm();
        }
        if(atualizarUsers.id_meu_adm() != null){
            this.id_meu_adm = atualizarUsers.id_meu_adm();
        }
    }
}
