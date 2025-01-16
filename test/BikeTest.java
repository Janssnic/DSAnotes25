import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void testInstantiateBikeModel(){
        Bike bike = new Bike("bmx","Helkama");
        assertEquals("bmx", bike.getModel());
    }
    @Test
    void testInstantiateBikeMake(){
        Bike bike = new Bike("bmx","Helkama");
        assertEquals("Helkama", bike.getMake());
    }
}