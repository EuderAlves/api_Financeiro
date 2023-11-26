package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.extrasEntrada.ExtraEntradas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtrasEntradaRepository extends JpaRepository<ExtraEntradas, Long> {
}
