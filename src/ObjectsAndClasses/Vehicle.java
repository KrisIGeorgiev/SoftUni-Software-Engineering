package ObjectsAndClasses;

public class Vehicle {
     private String typeVehicle;
     private String model;
     private String color;
     private int horsePower;


     public Vehicle(String typeVehicle, String model, String colour, int horsePower) {
         this.typeVehicle = typeVehicle;
         this.model = model;
         this.color = colour;
         this.horsePower = horsePower;

    }

    public String getTypeVehicle() {
        return this.typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return this.color;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public String toString() {
        String typeVeh = typeVehicle.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh + "\n" +
                "Model: " +  model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsePower;
    }
}
