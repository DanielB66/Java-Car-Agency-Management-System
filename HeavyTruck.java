public class HeavyTruck extends Truck {
    private String fuelType; // e.g., Diesel, Petrol

    public HeavyTruck(int number, String model, int year, int price, int km, int weight, boolean hasTrailer, String fuelType) {
        super(number, model, year, price, km, weight, hasTrailer);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + ", fuelType=" + fuelType;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        if (getClass() != other.getClass()) return false;
        HeavyTruck that = (HeavyTruck) other;
        return fuelType.equals(that.fuelType);
    }
}
