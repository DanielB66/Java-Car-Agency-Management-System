import java.util.ArrayList;

public class CarAgency {
    private String agencyName; // agency name
    private ArrayList<Car> cars; // car list

    public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public CarAgency(String name) {
        setAgencyName(name);
        cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        for (Car c : cars) {
            if (c.equals(car)) {
                System.out.println("Car already exists in the list.");
                return;
            }
        }
        cars.add(car);
    }

    public ArrayList<Car> between(double lowPrice, double highPrice) {
        ArrayList<Car> result = new ArrayList<Car>();
        for (Car c : cars) {
            if (c.getPrice() >= lowPrice && c.getPrice() <= highPrice) {
                result.add(c);
            }
        }
        return result;
    }

    public int countTracksWithTrailer(int year) {
        int count = 0;
        for (Car c : cars) {
            if (c instanceof Truck && c.getYear() == year) {
                if (((Truck) c).isHasTrailer()) {
                    count++;
                }
            }
        }
        return count;
    }
}
