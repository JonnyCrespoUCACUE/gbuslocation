package com.oos.gbuslocation.Repositorio;

import com.oos.gbuslocation.modelo.DatosBus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepositorio extends JpaRepository<DatosBus,Integer> {
}
