package dupradosantini.myfirstapi.services;

import dupradosantini.myfirstapi.domain.Usuario;
import dupradosantini.myfirstapi.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // indica ao spring que é um serviço
public class UsuarioService {

    @Autowired //ligacao ao repositorio
    private UsuarioRepository usuarioRepository; //repositorio que sera usado

    public Usuario findById(Long id){
        Optional<Usuario> obj = usuarioRepository.findById(id);//findById já é implementado para repositorios JPA

        return obj.orElse(null); //retorna o objeto, se ele for vazio retorna null
    }
}
