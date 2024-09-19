public class Main {
    public static void main(String[] args) {
        
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter (laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartPhoneChargerAdapter = new SmartphoneAdapter(smartphoneCharger);


        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartPhoneChargerAdapter.plugIn();
    }
}