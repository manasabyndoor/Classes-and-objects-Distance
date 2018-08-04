
public class DistanceTest {
	public static void main(String args[]) {

		Distance dist1 = new Distance();
		Distance dist2 = new Distance();
		Distance dist3 = new Distance();

		dist1.feet = 3;
		dist1.inches = (float) 0.4;
		dist2.feet = 5;
		dist2.inches = (float) 0.4;
		dist1.display();
		dist2.display();
		// sets the distance values

		float var = dist1.set(dist1.feet, dist1.inches);
		float var1 = dist2.set(dist2.feet, dist2.inches);
		System.out.println("distance" + var);
		System.out.println("distance" + var1);
		float sum = dist3.add(var, var1);
		System.out.println("distance" + sum);

	}

}
