
public class NuevaPartida {
	
	private int puntuacion = 0;

	public void rodar(int i, int j) {
	
	 puntuacion += (i+j); 
		
	}

	public Object GetPuntuacion() {
		
		return puntuacion;
	}

}
