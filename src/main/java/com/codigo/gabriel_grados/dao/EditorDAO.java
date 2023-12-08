package com.codigo.gabriel_grados.dao;

import com.codigo.gabriel_grados.entity.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorDAO extends JpaRepository<Editor,Long> {
}
