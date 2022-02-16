package dupradosantini.myfirstapi.services;

import dupradosantini.myfirstapi.domain.Usuario;
import dupradosantini.myfirstapi.repositories.UsuarioRepository;

import dupradosantini.myfirstapi.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario update(Long id, Usuario obj) {
        //checar se o ID existe
        Usuario newObj = findById(id); // Se houver retorno ou será o usuario ou o nosso erro personalizado
        newObj.setNome(obj.getNome());
        newObj.setLogin(obj.getLogin());
        newObj.setSenha(obj.getSenha());
        return usuarioRepository.save(newObj);

    }

    public Usuario create(Usuario obj) {
        obj.setId(null); //Garantir que não haverá colisão de ID caso a pessoa passe o ID do usuario (não deveria)
        return usuarioRepository.save(obj); //novamente o método save ja é implementado pelo JPA
    }
}
