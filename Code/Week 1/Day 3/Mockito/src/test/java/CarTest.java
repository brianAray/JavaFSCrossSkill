import com.revature.Car;
import com.revature.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class CarTest {

    private Car car;

    @Mock
    private Engine engine;

    @BeforeEach
    public void setup(){
        this.engine = mock(Engine.class);
        this.car = new Car(this.engine);
    }

    @Test
    public void testDrive(){
        // Establish the behavior of the mock object

        // Useful when you want to work with a void method
        // in general, void methods don't influence the behavior in a real way as nothing is returned
        doNothing().when(engine).ignite();
        Assertions.assertEquals(5, car.drive());
    }
}
