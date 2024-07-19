public class Car {
    private int number;  // car license no. (e.g., 123456, etc.)
    private String model; // car model (e.g., Fiat Punto, etc.)
    private int year;  // manufacture year (e.g., 1997, etc.)
    private int price;  // car price in $ (e.g., 5000, etc.)
    private int km;  // distance travelled in km (e.g., 121250, etc.)

    // Constructor
    public Car(int number, String model, int year, int price, int km) {
        setNumber(number);
        setModel(model);
        setYear(year);
        setPrice(price);
        setKm(km);
    }

    // Getters and Setters with validation
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (String.valueOf(number).length() == 6) {
            this.number = number;
        } else {
            this.number = 0; // default value
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() >= 3) {
            this.model = model;
        } else {
            this.model = "Unknown"; // default value
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1970) {
            this.year = year;
        } else {
            this.year = 1970; // default value
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0; // default value
        }
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        if (km >= 0) {
            this.km = km;
        } else {
            this.km = 0; // default value
        }
    }

    @Override
    public String toString() {
        return "Car [number=" + number + ", model=" + model + ", year=" + year + ", price=" + price + ", km=" + km + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Car car = (Car) other;
        return number == car.number && year == car.year && price == car.price && km == car.km && model.equals(car.model);
    }

    public int compareTo(Car other) {
        return Integer.compare(this.price, other.price);
    }

    public int finalPrice() {
        double depreciation = 0;
        if (year < 1980) {
            depreciation += 0.25;
        } else if (year <= 1989) {
            depreciation += 0.15;
        } else if (year <= 1999) {
            depreciation += 0.10;
        } else if (year <= 2009) {
            depreciation += 0.05;
        }

        if (km > 200000) {
            depreciation += 0.25;
        } else if (km > 150000) {
            depreciation += 0.15;
        } else if (km > 100000) {
            depreciation += 0.10;
        }

        double finalPrice = price * (1 - depreciation);
        return (int) Math.round(finalPrice);
    }
}
