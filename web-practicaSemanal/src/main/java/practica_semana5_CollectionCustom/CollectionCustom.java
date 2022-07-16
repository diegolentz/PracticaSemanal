
package practica_semana5_CollectionCustom;

public class CollectionCustom {
	
	private T coleccion[];
	private int tamanio;
	
	public CollectionCustom() {
		this.coleccion = new T[10];
		this.tamanio = 0;
	}
	
	public int size() {
		return tamanio;
	}
	
	public void addFirst(T objeto_aniadir) {
		int i;
		for(i=tamanio; i>0; i--) {
			coleccion[i] = coleccion[i-1];
		}
		coleccion[0] = objeto_aniadir;
		this.tamanio++;
	}
	
	public void addLast(T objeto_aniadir) {
		coleccion[this.tamanio] = objeto_aniadir;
		this.tamanio++;
	}
	
	public T remove(T objeto_remover) {
		int i = 0,j;
		T retornar = null;
		while(i<this.tamanio && retornar == null){
			if(objeto_remover == coleccion[i]) {
				retornar = coleccion[i];
				for(j = i; j < this.tamanio; j++) {
					coleccion[j] = coleccion[j+1];
				}
				this.tamanio--;
			}
			i++;
		}
		return retornar;
	}
	
	public void removeAll(T objeto_remover) {
		while(remove(objeto_remover) != null) {
			
		}
	}
	
	public boolean empty() {
		return this.tamanio == 0;
	}
	
	public void imprimir() {
		for(int i = 0; i < this.tamanio; i++) {
			System.out.print(coleccion[i].getNombre() + "  ");
		}
		System.out.println();
	}
}