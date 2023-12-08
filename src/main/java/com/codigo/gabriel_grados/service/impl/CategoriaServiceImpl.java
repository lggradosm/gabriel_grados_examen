package com.codigo.gabriel_grados.service.impl;

import com.codigo.gabriel_grados.dao.CategoriaDAO;
import com.codigo.gabriel_grados.entity.Categoria;
import com.codigo.gabriel_grados.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaDAO categoriaDAO;
    @Override
    public List<Categoria> obtenerTodos() {
        return categoriaDAO.findAll();
    }

    @Override
    public Categoria obtenerCategoriaPorId(Long id) {
        return categoriaDAO.findById(id).orElseThrow();
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaDAO.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaDAO.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaDAO.deleteById(id);
    }
}
