package Frogak;

import java.util.ArrayList;
import java.util.Collections;

public class Froga {
	public static void main(String[] args) { 
	    ArrayList<String> cars = new ArrayList<>();
	    int i = 1;
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println((i++)+".- "+cars);
	    cars.add("Mazdasss");
	    System.out.println((i++)+".- "+cars);
	    cars.add(0,"Lehenengoa");
	    System.out.println((i++)+".- "+cars);
	    System.out.println((i++)+".- "+cars.get(0));
	    System.out.println((i++)+".- "+cars.get(1));
	    cars.set(0,"Primero");
	    System.out.println((i++)+".- "+cars.get(0));
	    cars.remove(cars.size()-1);//Azken elementua ezabatu
	    System.out.println((i++)+".- "+cars);
	    Collections.sort(cars);
	    System.out.println((i++)+".- ordenatuta: "+cars);
	    cars.clear();
	    System.out.println((i++)+".- clear ondoren: "+cars);
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println((i++)+".- "+cars);
	  } 

}