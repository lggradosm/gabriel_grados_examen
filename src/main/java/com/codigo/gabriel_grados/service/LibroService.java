package com.codigo.gabriel_grados.service;

import com.codigo.gabriel_grados.entity.Libro;

import java.util.List;

public interface LibroService {
    List<Libro> obtenerTodos();
    Libro obtenerLibroPorId(Long id);
    Libro crearLibro(Libro libro);

    Libro actualizarLibro(Libro libro);
    void eliminarLibro(Long id);
}
