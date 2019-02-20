import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;



public class MouseTest {
    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("apple", "wireless", 2);
    }

    @Test
    public void canMoveMouse(){
        assertEquals("X12Y34", mouse.move("X12Y34") );
    }

    @Test
    public void canClickMouse(){
        assertTrue(mouse.click());
    }

    @Test
    public void canSendData(){
        assertEquals("ClickClick", mouse.sendData("ClickClick"));
    }
    
}
