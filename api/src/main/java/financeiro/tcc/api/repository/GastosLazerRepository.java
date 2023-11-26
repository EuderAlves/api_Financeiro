package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.gastosLazer.GastoLazer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastosLazerRepository extends JpaRepository<GastoLazer, Long> {
}
