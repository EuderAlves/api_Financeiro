package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.contasFixas.ContasFixa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContasFixasRepository extends JpaRepository<ContasFixa, Long> {
}
