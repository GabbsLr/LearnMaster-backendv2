package com.example.learnmaster.tccv2.repository;

import com.example.learnmaster.tccv2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}