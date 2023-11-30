package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.investimento.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InvestimentosRepository extends JpaRepository<Investimento, Long> {

    @Query(value = """
            SELECT * FROM investimentos i
            WHERE i.user  = :idUser""",nativeQuery = true)

    List<Investimento> findByUser(Long idUser);
}
