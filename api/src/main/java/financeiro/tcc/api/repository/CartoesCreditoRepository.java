package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.cartaoCredito.CartaoDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartoesCreditoRepository extends JpaRepository<CartaoDeCredito, Long> {
}
