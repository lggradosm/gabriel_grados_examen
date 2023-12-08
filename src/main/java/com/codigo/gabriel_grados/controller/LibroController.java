package com.codigo.gabriel_grados.controller;

import com.codigo.gabriel_grados.entity.Libro;
import com.codigo.gabriel_grados.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LibroController {
    @Autowired
    private LibroService libroService;
    @PostMapping("/libro")
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro){
        return ResponseEntity.status(HttpStatus.CREATED).body(libroService.crearLibro(libro));
    }
    @GetMapping("/libro/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable Long id){
        Libro libro = libroService.obtenerLibroPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(libro);
    }

    @PutMapping("/libro")
    public ResponseEntity<Libro> actualizarLibro(@RequestBody Libro libro){
        return ResponseEntity.status(HttpStatus.OK).body(libroService.actualizarLibro(libro));
    }

    @DeleteMapping("/libro/{id}")
    public ResponseEntity<String> eliminarLibro(@PathVariable Long id){
        libroService.eliminarLibro(id);
        return ResponseEntity.status(HttpStatus.OK).body("Libro con id: " + id +" eliminado");
    }

    @GetMapping("/libros")
    public ResponseEntity<List<Libro>> obtenerLibroes(){
        return ResponseEntity.status(HttpStatus.OK).body(libroService.obtenerTodos());
    }
}
