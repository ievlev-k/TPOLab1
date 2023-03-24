package task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;
public class modelTest {

    static AliveObject arthur;
    static AliveObject speaker;
    static RealObject window;
    static Surface surface;
    static UnrealObject cry;
    @BeforeAll
    public static void init(){
        arthur = new AliveObject("Артур", Job.SOLDIER );
        speaker = new AliveObject("Гришаня", Job.SPEAKER);
        window = new RealObject("Окно", Characteristic.MAJESTIC,3);
        surface = new Surface( TypeSurface.SLIPPERY,"пол");
        cry = new UnrealObject(Characteristic.AWFUL, "крик");

        assertNull(arthur.getState());
        assertNull(speaker.getState());
    }

    @Test
    public void checkSpeak(){
        assertTrue(speaker.isSpeak());
        speaker.setJob(Job.WRITER);
        assertFalse(speaker.isSpeak());
        speaker.setJob(Job.JOBLESS);
        assertFalse(speaker.isSpeak());
        speaker.setJob(Job.ARTIST);
        assertFalse(speaker.isSpeak());
        assertFalse(arthur.isSpeak());
    }

    @Test
    public void checkChangeState(){
        cry.setCharacteristic(Characteristic.AWFUL);
        arthur.changeState(cry);
        assertEquals(arthur.getState(), State.LOST);
        cry.setCharacteristic(Characteristic.MAJESTIC);
        arthur.changeState(cry);
        assertEquals(arthur.getState(), State.DISCOVERED);
        cry.setCharacteristic(Characteristic.SIMPLE);
        arthur.changeState(cry);
        assertEquals(arthur.getState(), State.UNDERSTOOD);
    }

    @Test
    public void checkMove(){
        window.setNumber(5);
        surface.setTypeSurface(TypeSurface.DRY);
        assertEquals(6, window.move(surface,arthur));
        window.setNumber(5);
        surface.setTypeSurface(TypeSurface.SLIPPERY);
        assertEquals(4, window.move(surface,arthur));
        window.setNumber(5);
        surface.setTypeSurface(TypeSurface.ROUGH);
        assertEquals(5, window.move(surface,arthur));
    }

    @Test
    public void checkState(){
        arthur.setState(State.LOST);
        assertEquals(arthur.getState(), State.LOST);
        arthur.setState(State.UNDERSTOOD);
        assertEquals(arthur.getState(), State.UNDERSTOOD);
        arthur.setState(State.DISCOVERED);
        assertEquals(arthur.getState(), State.DISCOVERED);
    }
}
