package aula09;

public class Plane {

    protected String id;
    protected String fabricante;
    protected String model;
    protected int yearProduction;
    protected int maxPassengers;
    protected int maxSpeed;

    public Plane(String id, String fabricante, String model, int yearProduction, int maxPassengers, int maxSpeed) {
        this.id = id;
        this.fabricante = fabricante;
        this.model = model;
        this.yearProduction = yearProduction;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public void setYearProduction(int yp) {
        if (yp < 2023 || yp > 1800) {
            this.yearProduction = yp;
        }
    }

    public void setMaxPassengers(int mp) {
        if (mp > 0) {
            this.yearProduction = mp;
        }
    }

    public void setMaxSpeed(int ms) {
        if (ms > 0) {
            this.yearProduction = ms;
        }
    }

    public String getId() {
        return id;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return  " with id:" + id + 
                ", fabricante:" + fabricante + 
                ", model:" + model + 
                ", year of production" + yearProduction +
                ", max capacity of:" + maxPassengers + 
                " and max speed of:" + maxSpeed;
    }
    
    
}
