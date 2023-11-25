package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
