
package ar.com.PracticaSemanal.daos.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.PracticaSemanal.daos.MenuDao;
import ar.com.PracticaSemanal.domain.Menu;

public class MenuDaoMySqlImpl extends JDBCBaseDao<Menu> implements MenuDao{

	public MenuDaoMySqlImpl() {
		super("menu");
	}

	@Override
	public Menu fromResultSetToEntity(ResultSet rs) throws SQLException {
		Long id = rs.getLong("id");
		String descripcion = rs.getString("menu");
		Long root = rs.getLong("root");
		Long idMenuPadre = rs.getLong("id_menu_padre");
		
		return new Menu(id, descripcion, root.equals(1L), idMenuPadre);
	}

}