package com.devsdoagi.exemploAPI.repository;

import com.devsdoagi.exemploAPI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
