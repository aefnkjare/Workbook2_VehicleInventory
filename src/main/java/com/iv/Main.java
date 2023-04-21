package com.iv;

public class Main {
    public static void main(String[] args) {
        Vehicle isaiahsAccord = new Vehicle(
                918273,
                "Accord",
                "periwinkle",
                209_881,
                2_500
        );

        System.out.println(isaiahsAccord.getMakeModel());
    }
}
    class Vehicle{
        // Properties
        private long vehicleId;
        private String makeModel;
        private String color;
        private int odometerReading;
        private float price;
        // Contructor(s)
        public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price){
            this.vehicleId = vehicleId;
            this.makeModel = makeModel;
            this.odometerReading = odometerReading;
            this.color = color;
            this.price = price;
        }
        // sets and gets
        public long getVehicleId(){
            return this.vehicleId;
        }

        public void setVehicleId(long vehicleId){
            this.vehicleId = vehicleId;
        }

        public String getMakeModel() {
            return makeModel;
        }

        public void setMakeModel(String makeModel) {
            this.makeModel = makeModel;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getOdometerReading() {
            return odometerReading;
        }

        public void setOdometerReading(int odometerReading) {
            this.odometerReading = odometerReading;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        // Custom methods
    }
