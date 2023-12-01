package financeiro.tcc.api.repository;

import financeiro.tcc.api.models.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(name = """
            SELECT  * FROM users u\s
            WHERE u.email  = :email""",nativeQuery = true)
    Optional<Users> findByEmail(String email);
}
