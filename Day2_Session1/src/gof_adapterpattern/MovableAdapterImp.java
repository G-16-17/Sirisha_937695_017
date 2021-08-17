package gof_adapterpattern;

 public class MovableAdapterImp implements MovableAdapter { 
	 BugattiVeyron buggattiVeyron=new  BugattiVeyron();
	 private Movable luxuryCars= buggattiVeyron;
	 
	 @Override 
	 public double getPrice() { 
		 return convertUSDtoEURO(luxuryCars.getPrice());
		 } 
	 
	 private double convertUSDtoEURO(double usd) { 
		 return (usd *0.82); 
		 }
 }
