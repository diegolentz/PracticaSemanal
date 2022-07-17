
package ar.com.PracticaSemanal.services;

import ar.com.PracticaSemanal.domain.Articulo;
import ar.com.PracticaSemanal.services.exceptions.ServiceException;

public interface ArticulosService extends GenericService<Articulo>{
	
	public Articulo getByCodigo(String codigo) throws ServiceException;
}