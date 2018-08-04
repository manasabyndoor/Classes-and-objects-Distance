
public class Distance {
	float feet;
	float inches;
	float distance;
	// float distance2;

	public float set(float x, float y)// set the values
	{
		feet = x;
		inches = y;

		distance = add(feet, inches);
		return distance;

	}

	// displays feets and inches
	void display() {
		System.out.println("feet=" + feet);
		System.out.println("inches=" + inches);
	}

	public float add(float a, float b) {
		return distance = a + b;

	}

}
