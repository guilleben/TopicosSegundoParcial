import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Bowling {
	
	private NuevaPartida partida; 

	@Before
	public void setUp() throws Exception {
		partida = new NuevaPartida();
	}

	@Test
	public void CrearPartida() {
		
	}
	
	@Test
	public void PeorPartida() {
		for (int i = 1; i <= 10; i++) {
			partida.rodar(0,0);
			
		}
		assertEquals(0, partida.GetPuntuacion());
		
	}
	
	@Test
	public void MejorPartida() {
		for (int i = 1; i <= 10; i++) {
			partida.rodar(10,0);
			
		}
		assertEquals(100, partida.GetPuntuacion());
		
	}
	
	@Test
	public void PuntajeFrame() {
		
			partida.rodar(2,5);
		assertEquals(7, partida.GetPuntuacion());
		
	}

}
