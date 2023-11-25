package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.users.DadosUsers;
import financeiro.tcc.api.models.users.Users;
import financeiro.tcc.api.repository.UsersRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;
    @PostMapping()
    @Transactional
    public void cadastroUser(@RequestBody @Valid DadosUsers dadosUsers){
        usersRepository.save(new Users(dadosUsers));
    }
}
