package practica_semana6_TryCatch.Excepcionese;

public class ErrorObtenerValor extends Exception{

	public ErrorObtenerValor() {}
	public ErrorObtenerValor(String msjError) {
		super(msjError);
	}
}