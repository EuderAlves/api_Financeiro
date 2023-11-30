package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.extrasEntrada.ExtraEntradas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExtrasEntradaRepository extends JpaRepository<ExtraEntradas, Long> {

    @Query(name = """
            SELECT * FROM extras_entradas ee
            WHERE ee.user = :idUser""",nativeQuery = true)
    List<ExtraEntradas> findByUser(Long idUser);
}
