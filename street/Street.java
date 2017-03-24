package street;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import streetobjects.Bike;
import streetobjects.Bus;
import streetobjects.Car;
import streetobjects.MovableObjects;
import streetobjects.Taxi;
import streetobjects.Vehicle;
/**
 * 
 * @author TaiaLeite
 * Class street will be responsible for creating all objects that belongs to the Street Set up.
 * It will create five black roads, dotted lines inside each road, cars, buses, bikes and taxi on the 
 * road and people on the footpath. 
 */
public class Street {

	private List <MovableObjects> objectInMoviment = new ArrayList<MovableObjects>();
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();//ArrayList to hold the objects
	private PApplet p;


	public Street(PApplet p) {
		super();
		this.p = p;

	}
	/**
	 * This method will create five black road.
	 * @param streets - street parameter will determine how many streets will be created.
	 */
	public void street(int streets){//How many streets should be created.
		int positionRoad = 0;
		for(int i = 0; i < streets; i++){//Making * different roads in black
			p.fill(0);
			p.strokeWeight(3);
			p.strokeCap(p.ROUND);
			p.stroke(255, 255, 255);
			p.rect(0, 135 + positionRoad, 1000, 92);
			positionRoad += 90; //will define the position of each road on the screen, one bellow each other
		}
	}
	/**
	 * This method will create white dotted lines in each road.
	 * @param y1
	 * @param y2
	 */
	public void linesInTheStreet(int y1){

		int positionLine = 0;//Lines for the road in white 
		for(int x = 0; x < 15; x++){//Creating 15 lines to represent the white lines on the road.
			p.strokeWeight(5);
			p.strokeCap(p.ROUND);
			p.line(0 + positionLine, y1, 50 + positionLine, y1);
			positionLine += 90;
		}
	}
}
