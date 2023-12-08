package com.codigo.gabriel_grados.service;

import com.codigo.gabriel_grados.entity.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> obtenerTodos();
    Categoria obtenerCategoriaPorId(Long id);
    Categoria crearCategoria(Categoria categoria);

    Categoria actualizarCategoria(Categoria categoria);
    void eliminarCategoria(Long id);
}
