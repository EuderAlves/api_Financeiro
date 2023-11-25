package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.banco.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<Banco, Long> {

}
