public class Jeep extends Car {
    private boolean is4x4;

    public Jeep(int number, String model, int year, int price, int km, boolean is4x4) {
        super(number, model, year, price, km);
        this.is4x4 = is4x4;
    }

    public boolean isIs4x4() {
        return is4x4;
    }

    public void setIs4x4(boolean is4x4) {
        this.is4x4 = is4x4;
    }

    @Override
    public String toString() {
        return super.toString() + ", is4x4=" + is4x4;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        if (getClass() != other.getClass()) return false;
        Jeep jeep = (Jeep) other;
        return is4x4 == jeep.is4x4;
    }
}
