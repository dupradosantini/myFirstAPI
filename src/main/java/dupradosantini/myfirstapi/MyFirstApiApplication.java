package dupradosantini.myfirstapi;

import dupradosantini.myfirstapi.bootstrap.BootStrapData;
import dupradosantini.myfirstapi.domain.Usuario;
import dupradosantini.myfirstapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyFirstApiApplication /*implements CommandLineRunner */{

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApiApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario("Valdir Cezar","valdir","senharuim");
		Usuario u2 = new Usuario("Albert Einstein", "albert", "senhaboa");

		usuarioRepository.saveAll(Arrays.asList(u1,u2));
	}*/
}
