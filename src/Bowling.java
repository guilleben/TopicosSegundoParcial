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
		for (int i = 0; i <= 10; i++) {
			partida.rodar(0,0);
			
		}
		assertEquals(0, partida.GetPuntuacion());
		
	}

}
