public class Truck extends Car {
    private int weight;
    private boolean hasTrailer;

    public Truck(int number, String model, int year, int price, int km, int weight, boolean hasTrailer) {
        super(number, model, year, price, km);
        this.weight = weight;
        this.hasTrailer = hasTrailer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return super.toString() + ", weight=" + weight + ", hasTrailer=" + hasTrailer;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        if (getClass() != other.getClass()) return false;
        Truck truck = (Truck) other;
        return weight == truck.weight && hasTrailer == truck.hasTrailer;
    }
}
