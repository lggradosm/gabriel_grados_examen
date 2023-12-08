package com.codigo.gabriel_grados.controller;

import com.codigo.gabriel_grados.entity.Autor;
import com.codigo.gabriel_grados.service.AutorService;
import jakarta.websocket.server.PathParam;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AutorController {
    @Autowired
    private AutorService autorService;
    @PostMapping("/autor")
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor){
        return ResponseEntity.status(HttpStatus.CREATED).body(autorService.crearAutor(autor));
    }
    @GetMapping("/autor/{id}")
    public ResponseEntity<Autor> obtenerAutorPorId(@PathVariable Long id){
        Autor autor = autorService.obtenerAutorPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(autor);
    }

    @PutMapping("/autor")
    public ResponseEntity<Autor> actualizarAutor(@RequestBody Autor autor){
        return ResponseEntity.status(HttpStatus.OK).body(autorService.actualizarAutor(autor));
    }

    @DeleteMapping("/autor/{id}")
    public ResponseEntity<String> eliminarAutor(@PathVariable Long id){
        autorService.eliminarAutor(id);
        return ResponseEntity.status(HttpStatus.OK).body("Autor con id: " + id +" eliminado");
    }

    @GetMapping("/autores")
    public ResponseEntity<List<Autor>> obtenerAutores(){
        return ResponseEntity.status(HttpStatus.OK).body(autorService.obtenerTodos());
    }
}
