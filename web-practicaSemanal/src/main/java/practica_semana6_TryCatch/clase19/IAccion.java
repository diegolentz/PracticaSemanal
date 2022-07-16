
package practica_semana6_TryCatch.clase19;

import practica_semana6_TryCatch.Excepcionese.ErrorBorrar;
import practica_semana6_TryCatch.Excepcionese.ErrorGuardar;
import practica_semana6_TryCatch.Excepcionese.ErrorListarTodo;
import practica_semana6_TryCatch.Excepcionese.ErrorObtenerValor;
import practica_semana6_TryCatch.Excepcionese.ErrorSubida;
import  practica_semana6_TryCatch.clase7.Articulo;
import  practica_semana6_TryCatch.clase7.Articulo;




public interface IAccion {

	public void exec(Articulo art) throws ErrorGuardar,ErrorBorrar,ErrorObtenerValor,ErrorListarTodo,ErrorSubida;
}