
import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Logitech", "wireless");
    }


    @Test
    public void canGetModel(){
        assertEquals("Logitech",keyboard.getModel());
    }

    @Test
    public void canGetType(){
        assertEquals("wireless", keyboard.getType());
    }

    @Test
    public void canSendData(){
        assertEquals("ClackClack", keyboard.sendData("ClackClack"));
    }
}
