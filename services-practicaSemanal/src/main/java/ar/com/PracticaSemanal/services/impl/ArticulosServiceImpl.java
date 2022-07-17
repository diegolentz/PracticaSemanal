
package ar.com.PracticaSemanal.services.impl;

import ar.com.PracticaSemanal.daos.db.exceptions.GenericException;
import ar.com.PracticaSemanal.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.PracticaSemanal.domain.Articulo;
import ar.com.PracticaSemanal.services.ArticulosService;
import ar.com.PracticaSemanal.services.exceptions.ServiceException;

public class ArticulosServiceImpl extends AbstractBaseService<Articulo> implements ArticulosService {

	public ArticulosServiceImpl() {
		super(new ArticuloDaoMysqlImpl());
	}
	
	@Override
	public Articulo getByCodigo(String codigo) throws ServiceException {
		try {
			return ((ArticuloDaoMysqlImpl)dao).getByCode(codigo);
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar T",e);
		}
	}
}