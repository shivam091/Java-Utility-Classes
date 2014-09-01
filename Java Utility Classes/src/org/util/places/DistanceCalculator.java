package org.util.places;

/**
 * This class contains methods to calculate distance between two points in KM.
 * 
 * @author shivam
 * 
 */
public class DistanceCalculator {

	/**
	 * This method calculates the distance between two points (given the
	 * latitude/longitude of those points). It is being used to calculate the
	 * distance between two locations.
	 * 
	 * @param latitude1
	 *            latitude of point 1 in degrees.
	 * @param longitude1
	 *            longitude of point 1 in degrees.
	 * @param latitude2
	 *            latitude of point 2 in degrees.
	 * @param longitude2
	 *            longitude of point 2 in degrees.
	 * @return <i>distance</i> between current location and destination location
	 *         in KM.
	 */
	public double calculateDistance(double latitude1, double longitude1,
			double latitude2, double longitude2) {
		double theta = longitude1 - longitude2;
		double distance = Math.sin(deg2rad(latitude1))
				* Math.sin(deg2rad(latitude2)) + Math.cos(deg2rad(latitude1))
				* Math.cos(deg2rad(latitude2)) * Math.cos(deg2rad(theta));
		distance = Math.acos(distance);
		distance = rad2deg(distance);
		distance = distance * 60 * 1.1515;
		distance = distance * 1.609344;

		return distance;
	}

	/**
	 * This method converts decimal <i>degrees</i> to <i>radians</i>.
	 * 
	 * @param degree
	 *            coordinate in degrees.
	 * @return coordinate in radians.
	 */
	private double deg2rad(double degree) {
		return (degree * Math.PI / 180.0);
	}

	/**
	 * This method converts <i>radians</i> to decimal <i>degrees</i>.
	 * 
	 * @param radian
	 *            coordinate in radians.
	 * @return coordinate in degrees.
	 */
	private double rad2deg(double radian) {
		return (radian * 180 / Math.PI);
	}
}