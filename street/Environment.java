package street;

import processing.core.PApplet;
import streetobjects.Bike;
import streetobjects.Bus;
import streetobjects.Car;
import streetobjects.People;
import streetobjects.Taxi;
import streetobjects.Vehicle;
/**
 * Environment class is responsible for holding all the objects created from classes
 * Car, Bus, Bike, Taxi and Street.
 * It also set up the Processing environment 
 * @author TaiaLeite
 * 
 */
public class Environment extends PApplet{

	Traffic traffic;
	Pedestrian people;//Creating a object that will hold people
	Vehicle vehicle;

	public void settings() {
		size(1000,690);
	}
	/**
	 * Method will set up the size, speed and position for each array of MovableObjectsand it objects.
	 * It will populate a arrayList called objectInMoviment type MovableObjects with Car, Taxi, Bus and Bike objects.
	 */
	public void setup(){
		people = new Pedestrian(this);//Creating a object that will hold people
		people.peopleOnTheStreet(200, 1);

		traffic = new Traffic(this);//Creating objects for each road.
		traffic.trafficFactory(5,2,1,2,165,10);//nt numberOfCars,int numberOfBuses,int numberOfTaxis, int numberOfBikes, int vehiclePosition
		traffic.trafficFactory(1,3,4,1,255,1);//nt numberOfCars,int numberOfBuses,int numberOfTaxis, int numberOfBikes, int vehiclePosition
		traffic.trafficFactory(4,2,2,4,345,8);//nt numberOfCars,int numberOfBuses,int numberOfTaxis, int numberOfBikes, int vehiclePosition
		traffic.trafficFactory(1,2,3,5,435,9);//nt numberOfCars,int numberOfBuses,int numberOfTaxis, int numberOfBikes, int vehiclePosition
		traffic.trafficFactory(3,1,4,1,525,9);//nt numberOfCars,int numberOfBuses,int numberOfTaxis, int numberOfBikes, int vehiclePosition
	}
	
	/**
	 * Draw the objects on the road.
	 */
	public void draw(){
		background(155);
		makeStreet(new Street(this));//Call method makeStreet and create the roads and lines in the screen
		traffic.show();//Show street One with movable objects
		people.show();
	}
	/*
	 * Drawing the streets. This method will call street method to create black roads
	 * @see Street Class. 
	 */
	public void makeStreet(Street s){
		//Drawing the street
		s.street(5);//Drawing 5 black streets
		s.linesInTheStreet(180);//TODO Drawing white dotted lines in the middle of the street
		s.linesInTheStreet(270);
		s.linesInTheStreet(360);
		s.linesInTheStreet(450);
		s.linesInTheStreet(540);
		//Finishing drawing the street

	}

	public static void main(String[] args) {

		PApplet.main(Environment.class);//Class reflection 
	}
}
