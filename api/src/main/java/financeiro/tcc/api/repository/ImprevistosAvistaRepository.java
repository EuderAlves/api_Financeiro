package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.imprevistosAvista.Impresvisto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImprevistosAvistaRepository extends JpaRepository<Impresvisto, Long> {

    @Query(name = """
            SELECT * FROM imprevistos_avista ia
            WHERE ia.user = :idUser""", nativeQuery = true)
    List<Impresvisto> findByUser(Long idUser);
}
