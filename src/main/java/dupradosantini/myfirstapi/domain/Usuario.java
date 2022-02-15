package dupradosantini.myfirstapi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity //Notação que informa ao JPA uma entidade que possuirá sua tabela correspondente no BD.
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L; //serialization ID (Boa pratica)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//estrategia de geracao do ID
    private Long id;

    @NotEmpty(message = "Campo NOME é mandatório")
    @Length(min=3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nome;
    @NotEmpty(message = "Campo LOGIN é mandatório")
    @Length(min=3, max = 30, message = "O login deve ter entre 3 e 30 caracteres")
    private String login;
    @NotEmpty(message = "Campo SENHA é mandatório")
    @Length(min=5, max = 20, message = "A senha deve ter entre 5 e 20 caracteres")
    private String senha;

    //Constructor
    public Usuario(String nome, String login, String senha){
        this.nome=nome;
        this.login=login;
        this.senha=senha;
    }

    //Metodos equals e hashcodde
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getId().equals(usuario.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
