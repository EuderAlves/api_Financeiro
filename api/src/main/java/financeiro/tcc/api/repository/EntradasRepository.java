package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.entradas.Entradas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradasRepository extends JpaRepository<Entradas, Long> {
}
