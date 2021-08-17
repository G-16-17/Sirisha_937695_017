package gof_adapterpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovableAdapterTest {

	@Test
	public void whenConvertingUSDtoEURO_thenSuccessfullyConverted() {
		//Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImp();
		
		assertEquals(bugattiVeyronAdapter.getPrice(),1558000,0.008);//("True",bugattiVeyronAdapter.getPrice(),1700000 );
	}

}
