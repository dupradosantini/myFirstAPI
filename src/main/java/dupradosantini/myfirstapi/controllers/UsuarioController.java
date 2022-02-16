package dupradosantini.myfirstapi.controllers;


import dupradosantini.myfirstapi.domain.Usuario;
import dupradosantini.myfirstapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Anotação que indica para a API que se trata de um controller
@RequestMapping(value = "/usuarios")  //Anotacao que indica o mapeamento URI para acessar esse serviço
public class UsuarioController {

    @Autowired//ligacao com o servico
    private UsuarioService usuarioService;

    @GetMapping(value = "/{id}")
     public ResponseEntity<Usuario> findById(@PathVariable Long id){
        Usuario usuarioObj = this.usuarioService.findById(id);
        return ResponseEntity.ok(usuarioObj);
     }
     @GetMapping
     public ResponseEntity<List<Usuario>> findAll(){ //Método retorna uma lista de tds usuarios
        List<Usuario> list = usuarioService.findAll();
        return ResponseEntity.ok().body(list);
     }
     @PutMapping(value =  "/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario obj){
        Usuario newObj = usuarioService.update(id,obj);
        return ResponseEntity.ok().body(newObj);
     }
}
