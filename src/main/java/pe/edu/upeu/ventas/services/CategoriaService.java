package pe.edu.upeu.ventas.services;

import java.util.List;


import pe.edu.upeu.ventas.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long idcategoria);
	public Categoria save(Categoria categoria);
	public void delete(Long idcategoria);

}
