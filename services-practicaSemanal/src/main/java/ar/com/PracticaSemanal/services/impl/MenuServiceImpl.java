
package ar.com.PracticaSemanal.services.impl;

import ar.com.PracticaSemanal.daos.impl.MenuDaoMySqlImpl;
import ar.com.PracticaSemanal.domain.Menu;
import ar.com.PracticaSemanal.services.MenuService;

public class MenuServiceImpl extends AbstractBaseService<Menu> implements MenuService {

	public MenuServiceImpl() {
		super(new MenuDaoMySqlImpl());
	}

}