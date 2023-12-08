package com.codigo.gabriel_grados.service;

import com.codigo.gabriel_grados.entity.Autor;
import com.codigo.gabriel_grados.entity.Editor;

import java.util.List;

public interface AutorService {
    List<Autor> obtenerTodos();
    Autor obtenerAutorPorId(Long id);
    Autor crearAutor(Autor autor);

    Autor actualizarAutor(Autor autor);
    void eliminarAutor(Long id);
}
