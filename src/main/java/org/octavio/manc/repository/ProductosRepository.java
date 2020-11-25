package org.octavio.manc.repository;

import org.octavio.manc.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}
