package com.iv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(918273, " Honda Accord", "periwinkle", 209_881, 2_500);
        //
        vehicles[1] = new Vehicle(918273, "Nissan Murano", "red", 120_888, 2_199);
        // 2: Id:918273, Make/Model: Nissan Murano, Color: Red, Odometer Reading: 120888, Price: 2199
        vehicles[2] = new Vehicle(918273, "Honda Odyssey", "blue", 319_976, 2_500);
        vehicles[3] = new Vehicle(918273, "Mercedes Benz", "black", 79_687, 2_500);
        vehicles[4] = new Vehicle(918273, "Ford Focus", "white", 179_900, 2_500);
        vehicles[5] = new Vehicle(918273, "Tesla Type S", "yellow", 100_900, 2_500);

        int totalNumOfVehicles = vehicles.length;

        int commandInput;

        do {
            Thread.sleep(1500);
            System.out.println("What do you want to do?\n" +
                    "\t1 - Find vehicles that match make/model\n" +
                    "\t2 - Find vehicles that fall within a price range\n" +
                    "\t3 - Find vehicles that match a color\n" +
                    "\t4 - List all vehicles\n" +
                    "\t5 - Add a vehicle\n" +
                    "\t6 - Quit\n" +
                    "Enter your command:\n"
            );
            commandInput = scanner.nextInt();

            switch(commandInput){
                case 1:
                    System.out.println("Find vehicle by make/model");
                    break;
                case 2:
                    System.out.println("Find vehicle by price");
                    break;
                case 3:
                    System.out.println("Find vehicle by color");
                    break;
                case 4:
                    System.out.println("List all vehivles");
                    for(int i=0; i<vehicles.length;i++){
                        if(vehicles[i] == null){
                            break;
                        }
                        System.out.printf("%d: Id: %d, Make/Model: %s, Color: %s, Odometer Reading: %d, Price: %f\n",
                                i+1,
                                vehicles[i].getVehicleId(),
                                vehicles[i].getMakeModel(),
                                vehicles[i].getColor(),
                                vehicles[i].getOdometerReading(),
                                vehicles[i].getPrice()
                        );
                    }
                    break;
                case 5:
                    System.out.println("Add a vehicle");
                    break;
                case 6:
                    System.out.println("Quitting");
                    break; //Quitting
                default:
                    System.out.println("Command Not Found You Bozo.");
            }
        } while(commandInput != 6);
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
