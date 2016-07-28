package b;

public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("saved to floppy...");
    }
}
