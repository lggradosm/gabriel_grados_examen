package com.codigo.gabriel_grados.controller;

import com.codigo.gabriel_grados.entity.Categoria;
import com.codigo.gabriel_grados.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @PostMapping("/categoria")
    public ResponseEntity<Categoria> crearCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.crearCategoria(categoria));
    }
    @GetMapping("/categoria/{id}")
    public ResponseEntity<Categoria> obtenerCategoriaPorId(@PathVariable Long id){
        Categoria categoria = categoriaService.obtenerCategoriaPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(categoria);
    }

    @PutMapping("/categoria")
    public ResponseEntity<Categoria> actualizarCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.actualizarCategoria(categoria));
    }

    @DeleteMapping("/categoria/{id}")
    public ResponseEntity<String> eliminarCategoria(@PathVariable Long id){
        categoriaService.eliminarCategoria(id);
        return ResponseEntity.status(HttpStatus.OK).body("Categoria con id: " + id +" eliminado");
    }

    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> obtenerCategoriaes(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.obtenerTodos());
    }
}
