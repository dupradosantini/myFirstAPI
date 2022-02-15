package dupradosantini.myfirstapi.repositories;

import dupradosantini.myfirstapi.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                 // <Tipo da classe, Tipo do ID>
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
