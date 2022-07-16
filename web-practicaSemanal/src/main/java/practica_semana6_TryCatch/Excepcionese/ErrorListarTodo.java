package practica_semana6_TryCatch.Excepcionese;

public class ErrorListarTodo extends Exception{

	public ErrorListarTodo() {}
	public ErrorListarTodo(String msjError) {
		super(msjError);
	}
}