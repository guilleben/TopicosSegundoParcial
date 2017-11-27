
public class NuevaPartida {
	
	private int puntuacion = 0;

	public void rodar(int rol1, int rol2) {
	
	 puntuacion += (rol1+rol2); 
		
	}

	public Object GetPuntuacion() {
		
		return puntuacion;
	}

}
