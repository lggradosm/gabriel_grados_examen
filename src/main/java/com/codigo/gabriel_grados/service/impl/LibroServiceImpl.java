package com.codigo.gabriel_grados.service.impl;

import com.codigo.gabriel_grados.dao.LibroDAO;
import com.codigo.gabriel_grados.entity.Libro;
import com.codigo.gabriel_grados.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroDAO libroDAO;
    @Override
    public List<Libro> obtenerTodos() {
        return libroDAO.findAll();
    }

    @Override
    public Libro obtenerLibroPorId(Long id)  {
        return libroDAO.findById(id).orElseThrow();
    }

    @Override
    public Libro crearLibro(Libro libro) {
        System.out.println("creando");
        return libroDAO.save(libro);
    }

    @Override
    public Libro actualizarLibro(Libro libro) {
        return libroDAO.save(libro);
    }

    @Override
    public void eliminarLibro(Long id) {
        libroDAO.deleteById(id);
    }
}
