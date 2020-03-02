package design.tes;

import design.bridge.GreenColor;
import design.bridge.Pentagon;
import design.bridge.RedColor;
import design.bridge.Shape;
import design.bridge.Triangle;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}