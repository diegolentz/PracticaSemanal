
package ar.com.PracticaSemanal.services.impl;

import ar.com.PracticaSemanal.daos.impl.CategoriasDaoMysqlImpl;
import ar.com.PracticaSemanal.domain.Categorias;
import ar.com.PracticaSemanal.services.CategoriasService;

public class CategoriasServiceImpl extends AbstractBaseService<Categorias> implements CategoriasService {

	public CategoriasServiceImpl() {
		super(new CategoriasDaoMysqlImpl());
	}
}