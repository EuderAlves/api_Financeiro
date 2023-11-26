package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.investimento.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentosRepository extends JpaRepository<Investimento, Long> {
}
