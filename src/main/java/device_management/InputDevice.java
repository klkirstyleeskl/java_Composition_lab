package device_management;

public abstract class InputDevice {

    private String model;
    private String type;


    public InputDevice(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String sendData(String data){
        return data;
    }
}
