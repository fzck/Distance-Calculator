
public class DistanceCalculator {
	private static final Coordinate FROM = new Coordinate(10.3106556,123.9802214);
	private static final Coordinate[] TO = new Coordinate[10];
	
	public void initCoord(){
		TO[0] = new Coordinate(10.3687263,123.87340310000002);
		TO[1] = new Coordinate(9.463221299999999,123.3800771);
		TO[2] = new Coordinate(10.3053871,123.9669017);
		TO[3] = new Coordinate(10.2820768,123.88122980000003);
		TO[4] = new Coordinate(9.801818700000002,123.37452529999996);
		TO[5] = new Coordinate(9.822868699999997,123.43985079999993);
		TO[6] = new Coordinate(10.2935413,123.90193339999996);
		TO[7] = new Coordinate(10.4858484,123.77411949999998);
		TO[8] = new Coordinate(11.1843073,123.74624570000003);
		TO[9] = new Coordinate(11.3358464,124.11563619999993);
	}
	
	public static double distance(int dest,String unit) {
		double theta = FROM.longitude - TO[dest].longitude;
		double dist = Math.sin(deg2rad(FROM.latitude)) * Math.sin(deg2rad(TO[dest].latitude)) + Math.cos(deg2rad(FROM.latitude)) * Math.cos(deg2rad(TO[dest].latitude)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == "K") {
			dist = dist * 1.609344;
		} else if (unit == "N") {
			dist = dist * 0.8684;
		}

		return (dist);
	}
	
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
	
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

}
