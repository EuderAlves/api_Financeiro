package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.saida.Saida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaidaRepository extends JpaRepository<Saida, Long> {
}
