package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.entradas.Entradas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntradasRepository extends JpaRepository<Entradas, Long> {

    @Query(name = """
            SELECT * FROM entradas e
            WHERE e.user  = :idUser""",nativeQuery = true)

    List<Entradas> findByUser(Long idUser);
}
