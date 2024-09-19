public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }
    public void plugIn() {
        smartphoneCharger.chargePhone();
    }
}