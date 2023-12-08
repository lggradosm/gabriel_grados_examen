package com.codigo.gabriel_grados.dao;

import com.codigo.gabriel_grados.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDAO extends JpaRepository<Autor,Long> {
}
