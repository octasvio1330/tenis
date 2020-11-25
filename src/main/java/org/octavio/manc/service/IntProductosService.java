package org.octavio.manc.service;

import java.util.List;

import org.octavio.manc.model.Producto;

public interface IntProductosService {
	
	//operaciones a realizar 
	public List<Producto> obtenerTodos();
	public void guardar(Producto producto);
	public void eliminar(Integer idProducto);
	public Producto buscarporId(Integer idProducto);

}
