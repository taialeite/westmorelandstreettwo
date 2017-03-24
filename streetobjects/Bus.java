package streetobjects;

import processing.core.PApplet;

public class Bus extends Vehicle {


	public Bus( float xCoordinate, float yCoordinate, float width, float height, int speed, PApplet p) {
		super(xCoordinate, yCoordinate, 80, 30,speed, p);//All buses will have 80x30cm for now 
		this.setColour(p.color(255, 204, 0));//Color of all buses will be yellow
		
		
	}

	@Override
	public void createObject() {
		p.fill(this.getColour());
		p.rect(this.getxCoordinate(), this.getyCoordinate(), this.getWidth(), this.getHeight());
	}
	@Override
	public void changeLine() {
		// TODO Auto-generated method stub
		
	}

}
