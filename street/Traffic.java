package street;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import streetobjects.Bike;
import streetobjects.Bus;
import streetobjects.Car;
import streetobjects.Taxi;
import streetobjects.Vehicle;

public class Traffic {
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();//ArrayList to hold the objects
	private Vehicle vehicle;
	private PApplet p;
	

	
	public Traffic(PApplet p) {
		super();
		this.p = p;
	}

	/**
	 * Method used to create vehicles on the road and add to the ArrayList vehicleList
	 * @param move  - Pass the vehicle type we want to create
	 */
	public List<Vehicle> vehicleOnTheStreet(Vehicle move){
		this.vehicle = move;
		vehicleList.add(vehicle);
		return vehicleList;

	}
	/**
	 * This method helps to create vehicles on the line number one in quantity
	 * @param vehicle
	 * @param numberOfVehicle
	 * @param v
	 */
	public void trafficFactory(Vehicle vehicle, int numberOfVehicle, int vehiclePosition){
		this.vehicle = vehicle;
		int x = 0;
		
		for(int i = 0; i < numberOfVehicle; i++){
			
			if(vehicle instanceof Car){
				vehicleOnTheStreet(new Car(vehicle.getxCoordinate() + x, vehiclePosition,
						vehicle.getWidth(),vehicle.getHeight(), vehicle.getSpeed(),p));
				x +=100; 
			
			}
			
			else if(vehicle instanceof Bus){
				vehicleOnTheStreet(new Bus(vehicle.getxCoordinate() + x, vehiclePosition,
						vehicle.getWidth(),vehicle.getHeight(), vehicle.getSpeed(),p));
				x +=200; 
			}
			
			else if(vehicle instanceof Bike){
				vehicleOnTheStreet(new Bike(vehicle.getxCoordinate() + x, vehiclePosition,
						vehicle.getWidth(),vehicle.getHeight(), vehicle.getSpeed(),p));
				x +=300; 
			}
			
			else if(vehicle instanceof Taxi){
				vehicleOnTheStreet(new Taxi(vehicle.getxCoordinate() + x, vehiclePosition,
						vehicle.getWidth(),vehicle.getHeight(), vehicle.getSpeed(),p));
				x +=400; 
			}
			System.out.println(Vehicle.getCount());

		}
		
	}
	/**
	 * /**
	 * This method helps to create vehicles on the road depending on specifications
	 * @param numberOfCars
	 * @param numberOfBuses
	 * @param numberOfTaxis
	 * @param numberOfBikes
	 * @param vehiclePosition
	 */
	public void trafficFactory(int numberOfCars,int numberOfBuses,int numberOfTaxis, int numberOfBikes, int vehiclePosition, int speed){
		int x = 0;
		
		for(int i = 0; i < numberOfCars; i++){
				
				vehicleOnTheStreet(new Car(100 + x, vehiclePosition,
						50,30, (int) speed,p));
				x +=200; 	

		}
		for(int i = 0; i < numberOfBuses; i++){
			
			vehicleOnTheStreet(new Bus(100 + x, vehiclePosition,
					50,30, (int) speed,p));
			x +=200; 	

	}
		for(int i = 0; i < numberOfTaxis; i++){
					
					vehicleOnTheStreet(new Taxi(100 + x, vehiclePosition,
							50,30, (int) speed,p));
					x +=200; 	
		
			}
		
		for(int i = 0; i < numberOfBikes; i++){
			
			vehicleOnTheStreet(new Bike(100 + x, vehiclePosition,
					40,10, (int) speed,p));
			x +=200; 	

	}
		System.out.println(Vehicle.getCount());

	}

	/**
	 * Method used to create vehicles on the road in one type. - TODO not being used.
	 * @param positionX
	 * @param positionY
	 * @param numberOfObjects
	 * @param speedCar
	 * @param speedTaxi
	 * @param speedBus
	 * @param speedBike
	 */
//	public void vehicleOnTheStreet(int positionX, int positionY, int numberOfObjects, int speedCar, int speedTaxi, int speedBus, int speedBike){
//		this.speedCar = speedCar;
//		this.speedBus = speedBus;
//		this.speedBike = speedBike;
//		this.speedTaxi = speedTaxi;
//
//		for(int i = 0; i < numberOfObjects; i++){//First Array of objects
//			objectInMoviment.add(new Car(positionX, positionY,30,30, speedCar,p));
//			objectInMoviment.add(new Taxi(positionX + 75, positionY - 3,35,35, speedTaxi,p));
//			objectInMoviment.add(new Bus(positionX + 125, positionY - 1,55,30,speedBus,p));
//			objectInMoviment.add(new Bike(positionX + 185, positionY +10,20,10,speedBike,p));
//			positionX +=250;	
//		}
//	}
	
	/**
	 * This method will draw Vehicles into the street. 
	 * It speed will be according to each Vehicle.
	 */
	public void show(){//Iterate through the array to show the objects

		for(Vehicle objects: vehicleList){//Vehicle ArrayList populated with objects type Vehicle
			p.noStroke();
			objects.createObject();
			objects.move();
		}

	}

}
