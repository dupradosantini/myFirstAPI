package dupradosantini.myfirstapi.bootstrap;

import dupradosantini.myfirstapi.domain.Usuario;
import dupradosantini.myfirstapi.repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BootStrapData implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;

    public BootStrapData(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void run(String... args) /*throws Exception*/ {
        Usuario u1 = new Usuario("Valdir Cezar","valdir","senharuim");
        Usuario u2 = new Usuario("Albert Einstein", "albert", "senhaboa");

        usuarioRepository.saveAll(Arrays.asList(u1,u2));

        //Starting message.
        System.out.println("Started in Bootstrap");

        //Query to count number of users.
        System.out.println("Number of users:" + usuarioRepository.count());
    }
}
