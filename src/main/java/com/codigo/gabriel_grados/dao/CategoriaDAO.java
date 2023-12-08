package com.codigo.gabriel_grados.dao;

import com.codigo.gabriel_grados.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria,Long> {
}
