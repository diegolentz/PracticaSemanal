package sqltest;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



import java.lang.reflect.Field;
import java.util.Date;

import ar.com.PracticaSemanal.daos.ArticuloDao;
import ar.com.PracticaSemanal.daos.db.exceptions.DuplicatedException;
import ar.com.PracticaSemanal.daos.db.exceptions.GenericException;
import ar.com.PracticaSemanal.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.PracticaSemanal.daos.impl.CategoriasDaoMysqlImpl;
import ar.com.PracticaSemanal.domain.Articulo;
import ar.com.PracticaSemanal.domain.Categorias;
import ar.com.PracticaSemanal.domain.Orden;

	public class test {

		@Test
		public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
			Articulo aprueba = new Articulo(8l, "titulo", "codigo", new Date(), 1500D, 1l, 1l, 1l);
			
			ArticuloDaoMysqlImpl art2 = new ArticuloDaoMysqlImpl();
			
			System.out.println(art2.getSaveSQL2(aprueba));
		}
		
		@Test
		public void when_newArticulo_then_persistIt() throws GenericException, DuplicatedException {
			//quiero probar el metodo save
			ArticuloDao art = new ArticuloDaoMysqlImpl();
			
			//necesito un articulo
			Articulo newArticulo = new Articulo("titulo", "codigo001", new java.util.Date(), 1500d, 100l, 1l, 1l);
			
			art.save(newArticulo);
		
			assertNotNull(newArticulo.getId());
		}
		
}