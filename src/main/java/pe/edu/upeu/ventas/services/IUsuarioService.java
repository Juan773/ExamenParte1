package pe.edu.upeu.ventas.services;

import pe.edu.upeu.ventas.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
