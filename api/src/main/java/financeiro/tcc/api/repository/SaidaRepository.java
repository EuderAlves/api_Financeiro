package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.saida.Saida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaidaRepository extends JpaRepository<Saida, Long> {

    @Query(name= """
            SELECT * FROM saidas s
            WHERE s.user = :idUser""",nativeQuery = true)
    List<Saida> findByUser(Long idUser);
}
