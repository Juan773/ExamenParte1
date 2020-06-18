package pe.edu.upeu.ventas.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.ventas.dao.ProductoDao;
import pe.edu.upeu.ventas.services.ProductoService;
import pe.edu.upeu.ventas.entity.Producto;
@Service
public class ProductoServiceImpl  implements ProductoService{
	 @Autowired
	 private ProductoDao productoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long idproducto) {
		// TODO Auto-generated method stub
		return productoDao.findById(idproducto).orElse(null);
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	public void delete(Long idcategoria) {
		// TODO Auto-generated method stub
		productoDao.deleteById(idcategoria);
		
	}

}
