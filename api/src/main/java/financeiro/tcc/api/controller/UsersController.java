package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.users.DadosUsers;
import financeiro.tcc.api.models.users.Users;
import financeiro.tcc.api.repository.UsersRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping()
    public List<Users> listaUser(){
        return usersRepository.findAll();
    }

    @GetMapping("{idUser}")
    public Optional<Users> listaUserByIdUser(@PathVariable("idUser") Long idUser) {
        return usersRepository.findById(idUser);
    }
}
