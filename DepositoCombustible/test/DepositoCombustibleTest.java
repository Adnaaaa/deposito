import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		double depNivel = tank.getDepositoNivel();
		assertEquals (20.0,depNivel,0.1);
		
	}



	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double depMax = tank.getDepositoMax();
		assertEquals (40.0,depMax,0.1);
	}

	

	@Test
	public void testEstaVacio() {   
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(0);
		assertTrue (tank.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(20.0,20.0);
		tank.fill(20);
		assertTrue (tank.getDepositoMax()<tank.getDepositoNivel());
	}

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		tank.fill(10);
		double depNivel=tank.getDepositoNivel();
		assertEquals (30.0,depNivel,0.1);
	}

	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		tank.consumir(10);
		double depNivel=tank.getDepositoNivel();
		assertEquals (10.0,depNivel,0.1);
	}

}
