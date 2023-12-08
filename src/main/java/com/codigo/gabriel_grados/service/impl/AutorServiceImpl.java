package com.codigo.gabriel_grados.service.impl;

import com.codigo.gabriel_grados.dao.AutorDAO;
import com.codigo.gabriel_grados.entity.Autor;
import com.codigo.gabriel_grados.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl implements AutorService {
    @Autowired
    private AutorDAO autorDAO;
    @Override
    public List<Autor> obtenerTodos() {
        return autorDAO.findAll();
    }

    @Override
    public Autor obtenerAutorPorId(Long id)  {
        return autorDAO.findById(id).orElseThrow();
    }

    @Override
    public Autor crearAutor(Autor autor) {
        return autorDAO.save(autor);
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        return autorDAO.save(autor);
    }

    @Override
    public void eliminarAutor(Long id) {
        autorDAO.deleteById(id);
    }
}
