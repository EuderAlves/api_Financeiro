package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.contasFixas.ContasFixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContasFixasRepository extends JpaRepository<ContasFixa, Long> {

    @Query(name = """
            SELECT * FROM contas_fixas cf
            WHERE cf.user  = :idUser""",nativeQuery = true)

    List<ContasFixa> findByUser(Long idUser);
}
