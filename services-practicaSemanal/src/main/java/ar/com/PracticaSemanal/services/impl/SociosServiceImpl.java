
package ar.com.PracticaSemanal.services.impl;

import ar.com.PracticaSemanal.daos.impl.SociosDaoMysqlImpl;
import ar.com.PracticaSemanal.domain.Socios;
import ar.com.PracticaSemanal.services.SociosService;

public class SociosServiceImpl extends AbstractBaseService<Socios> implements SociosService {

	public SociosServiceImpl() {
		super(new SociosDaoMysqlImpl());
	}
}