package street;
import java.util.ArrayList;
import processing.core.PApplet;

import streetobjects.MovableObjects;
import streetobjects.People;

public class Pedestrian {
	
	private ArrayList<MovableObjects> listOfPeople = new ArrayList<MovableObjects>();
	private int speedPeople;
	private PApplet p;
	
	public Pedestrian(PApplet p) {
		super();
		this.p = p;
	}

	/**
	 * This method will create people on the footpath walking randomly.  
	 * It will create objects of people to create black dotes representing people.
	 * @param numberOfPeople - number of people to be created in each object
	 * @param speed - speed of the people
	 */
	public void peopleOnTheStreet(int numberOfPeople, int speed){//setup //TODO

		this.speedPeople =	speed;
		int positionX = 15;

		for(int i = 0; i < numberOfPeople; i++){
			listOfPeople.add(new People(positionX, 50,10,10, speed,p));
			listOfPeople.add(new People(positionX, 30,10,10, speed,p));
			listOfPeople.add(new People(positionX, 60,10,10, speed,p));
			listOfPeople.add(new People(positionX, 120,10,10, speed,p));
			listOfPeople.add(new People(positionX, 600,10,10, speed,p));
			listOfPeople.add(new People(positionX, 630,10,10, speed,p));
			listOfPeople.add(new People(positionX, 650,10,10, speed,p));
			listOfPeople.add(new People(positionX, 660,10,10, speed,p));
			positionX +=50;
		}


	}
	
	public void show(){
		for(MovableObjects people: listOfPeople){
			people.createObject();
			people.move();

		}
		
	}
}
