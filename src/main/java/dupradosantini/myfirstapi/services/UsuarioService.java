package dupradosantini.myfirstapi.services;

import dupradosantini.myfirstapi.domain.Usuario;
import dupradosantini.myfirstapi.repositories.UsuarioRepository;

import dupradosantini.myfirstapi.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // indica ao spring que é um serviço
public class UsuarioService {

    @Autowired //ligacao ao repositorio
    private UsuarioRepository usuarioRepository; //repositorio que sera usado

    public Usuario findById(Long id){
        Optional<Usuario> obj = usuarioRepository.findById(id);//findById já é implementado para repositorios JPA
        //Throw com classe anonima passando a mensagem conforme estruturada aqui
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id +", Tipo: " + Usuario.class.getName())); //retorna o objeto, se ele for vazio retorna null
    }
}
