package c;

import org.springframework.stereotype.Component;


@Component
public class UsbWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("saved to USB...");
    }
}
