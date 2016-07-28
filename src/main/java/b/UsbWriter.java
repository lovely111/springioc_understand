package b;

public class UsbWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("saved to USB...");
    }
}
