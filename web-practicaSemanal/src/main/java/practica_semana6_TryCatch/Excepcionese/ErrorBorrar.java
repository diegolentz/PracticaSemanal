package practica_semana6_TryCatch.Excepcionese;

public class ErrorBorrar extends Exception {
	public ErrorBorrar () {}
	public ErrorBorrar (String msjError) {
		super(msjError);
	}
}