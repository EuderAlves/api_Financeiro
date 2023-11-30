package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.banco.Banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BancoRepository extends JpaRepository<Banco, Long> {

    @Query(name = """
            SELECT * FROM banco b
            WHERE b.user = :idUser""",nativeQuery = true)

    List<Banco> findByUser(Long idUser);
}
