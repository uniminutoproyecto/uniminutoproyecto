package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

    public UsuarioModel save(UsuarioModel usuario);

    public Optional<UsuarioModel> findById(Long id);

    public void deleteById(Long id);

}