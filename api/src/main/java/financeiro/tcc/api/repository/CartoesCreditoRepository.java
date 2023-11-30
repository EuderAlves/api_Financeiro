package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.cartaoCredito.CartaoDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CartoesCreditoRepository extends JpaRepository<CartaoDeCredito, Long> {


    @Query(name = """
            SELECT * FROM cartoes_credito cc\s
            WHERE cc.user  = :idUser""",nativeQuery = true)
    List<CartaoDeCredito> findByUser(Long idUser);
}
