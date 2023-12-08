package com.codigo.gabriel_grados.service;

import com.codigo.gabriel_grados.entity.Editor;

import java.util.List;

public interface EditorService {
    List<Editor> obtenerTodos();
    Editor obtenerEditorPorId(Long id);
    Editor crearEditor(Editor editor);

    Editor actualizarEditor(Editor editor);
    void eliminarEditor(Long id);
}
