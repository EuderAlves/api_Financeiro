package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.imprevistosAvista.Impresvisto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImprevistosAvistaRepository extends JpaRepository<Impresvisto, Long> {
}
