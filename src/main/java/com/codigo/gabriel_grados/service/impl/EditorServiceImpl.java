package com.codigo.gabriel_grados.service.impl;

import com.codigo.gabriel_grados.dao.EditorDAO;
import com.codigo.gabriel_grados.entity.Editor;
import com.codigo.gabriel_grados.entity.Editor;
import com.codigo.gabriel_grados.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorServiceImpl implements EditorService {
    @Autowired
    private EditorDAO editorDAO;
    @Override
    public List<Editor> obtenerTodos() {
        return editorDAO.findAll();
    }

    @Override
    public Editor obtenerEditorPorId(Long id)  {
        return editorDAO.findById(id).orElseThrow();
    }

    @Override
    public Editor crearEditor(Editor editor) {
        return editorDAO.save(editor);
    }

    @Override
    public Editor actualizarEditor(Editor editor) {
        return editorDAO.save(editor);
    }

    @Override
    public void eliminarEditor(Long id) {
        editorDAO.deleteById(id);
    }
}
