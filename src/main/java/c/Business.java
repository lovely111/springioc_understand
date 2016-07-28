package c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Business {
    @Autowired
    @Qualifier("floppyWriter")
    private DeviceWriter deviceWriter; // null

//    public Business(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }

//    @Autowired
//    @Qualifier("usbWriter")
//    public void setDeviceWriter(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
