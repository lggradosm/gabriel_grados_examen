package com.codigo.gabriel_grados.controller;

import com.codigo.gabriel_grados.entity.Editor;
import com.codigo.gabriel_grados.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class EditorController {
    @Autowired
    private EditorService editorService;
    @PostMapping("/editor")
    public ResponseEntity<Editor> crearEditor(@RequestBody Editor editor){
        return ResponseEntity.status(HttpStatus.CREATED).body(editorService.crearEditor(editor));
    }
    @GetMapping("/editor/{id}")
    public ResponseEntity<Editor> obtenerEditorPorId(@PathVariable Long id){
        Editor editor = editorService.obtenerEditorPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(editor);
    }

    @PutMapping("/editor")
    public ResponseEntity<Editor> actualizarEditor(@RequestBody Editor editor){
        return ResponseEntity.status(HttpStatus.OK).body(editorService.actualizarEditor(editor));
    }

    @DeleteMapping("/editor/{id}")
    public ResponseEntity<String> eliminarEditor(@PathVariable Long id){
        editorService.eliminarEditor(id);
        return ResponseEntity.status(HttpStatus.OK).body("Editor con id: " + id +" eliminado");
    }

    @GetMapping("/editores")
    public ResponseEntity<List<Editor>> obtenerEditores(){
        return ResponseEntity.status(HttpStatus.OK).body(editorService.obtenerTodos());
    }
}
