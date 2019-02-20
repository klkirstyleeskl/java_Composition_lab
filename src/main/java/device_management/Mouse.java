package device_management;

public class Mouse extends InputDevice {

    private int numberOfButtons;

    public Mouse(String model, String type, int numberOfButtons) {
        super(model, type);
        this.numberOfButtons = numberOfButtons;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public String move(String coords){
        return coords;
    }

    public Boolean click(){
        return true;
    }

    @Override
    public String sendData(String coords){
        return move(coords);

    }
}
