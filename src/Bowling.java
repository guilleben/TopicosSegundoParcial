import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Bowling {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void CrearPartida() {
		
		NuevaPartida partida = new NuevaPartida();
		
	}
	
	@Test
	public void PeorPartida() {
		NuevaPartida partida = new NuevaPartida();
		for (int i = 1; i <= 10; i++) {
			partida.rodar(0,0);
			
		}
		assertEquals(0, partida.GetPuntuacion());
		
	}
	
	@Test
	public void MejorPartida() {
		NuevaPartida partida = new NuevaPartida();
		for (int i = 1; i <= 10; i++) {
			partida.rodar(10,0);
			
		}
		assertEquals(100, partida.GetPuntuacion());
		
	}

}
