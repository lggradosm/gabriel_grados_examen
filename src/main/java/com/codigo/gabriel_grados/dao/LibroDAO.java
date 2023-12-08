package com.codigo.gabriel_grados.dao;

import com.codigo.gabriel_grados.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroDAO extends JpaRepository<Libro,Long> {
}
