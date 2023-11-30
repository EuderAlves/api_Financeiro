package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.gastosLazer.GastoLazer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GastosLazerRepository extends JpaRepository<GastoLazer, Long> {

    @Query(name = """
            SELECT * FROM gastos_lazer gl
            WHERE gl.user  = :idUser""",nativeQuery = true)
    List<GastoLazer> findByUser(Long idUser);
}
