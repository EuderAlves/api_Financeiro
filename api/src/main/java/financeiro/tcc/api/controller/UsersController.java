package financeiro.tcc.api.controller;

import financeiro.tcc.api.models.users.AtualizarUsers;
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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;
    @PostMapping()
    @Transactional
    public void cadastroUser(@RequestBody @Valid DadosUsers dadosUsers){
        usersRepository.save(new Users(dadosUsers));
    }

    @PutMapping()
    @Transactional
    public void atualizaUser(@RequestBody @Valid AtualizarUsers atualizarUsers){
        var user = usersRepository.getReferenceById(atualizarUsers.id());
        user.atualizarUser(atualizarUsers);
    }
    @GetMapping()
    public List<Users> listaUser(){
        return usersRepository.findAll();
    }

    @GetMapping("/identificador")
    public Optional<Users> listaUserByIdUser(@RequestParam("email") String email) {
        return usersRepository.findByEmail(email);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirUser(@PathVariable("id") Long id){
        usersRepository.deleteById(id);

    }
}
