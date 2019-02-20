package device_management;

import behaviours.IInput;

public abstract class InputDevice implements IInput {

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

    public String preInputData(String data){
        return "Input equals " + data;

    }

    public String sendData(String data){
        return preInputData(data);
    }
}
