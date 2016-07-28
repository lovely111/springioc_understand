package b;


public class Service {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
        Business business = new Business(new UsbWriter());
        business.write();
    }
}
