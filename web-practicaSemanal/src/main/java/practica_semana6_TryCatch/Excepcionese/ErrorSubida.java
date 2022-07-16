package practica_semana6_TryCatch.Excepcionese;

public class ErrorSubida extends Exception {

	public ErrorSubida() {}
	public ErrorSubida(String msjError) {
		super(msjError);
	}
}