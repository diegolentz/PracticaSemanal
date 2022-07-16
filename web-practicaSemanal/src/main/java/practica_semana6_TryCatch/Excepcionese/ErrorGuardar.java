package practica_semana6_TryCatch.Excepcionese;

public class ErrorGuardar extends Exception {

	public ErrorGuardar() {}
	public ErrorGuardar(String msjError) {
		super(msjError);
	}
}