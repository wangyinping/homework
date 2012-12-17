import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 07-11-27
 * Time: 上午6:59
 * To change this template use File | Settings | File Templates.
 */
public class ParkingTest {
 @Test
    public void should_return_99_after_park_a_car(){
     Parking park = new Parking();
     park.setS(100);
     int num=park.park();
     assertEquals(99,num);}
 @Test    
    public void should_return_1andA_after_take_a_car(){
         Parking park = new Parking();
         Car car = new Car();
         car.setCarNum("A");
          park.setS(0);
            int num=park.take("A");
         assertEquals(1, num);
         assertEquals("A",car.getCarNum());}
 @Test
    public void should_return_fail_if_no_parking_space(){
        Parking park = new Parking();
        Car car = new Car();
        park.setS(0);
        int num=park.park();
     assertEquals(0, num);}
 @Test
    public void should_return_successfully_taking_with_validParkingCertificate_by_only_once(){
        Parking park = new Parking();
        Car car = new Car();
        car.setVPC("1a2b3c");
        park.setS(100);
        int num=park.park();
        assertEquals("1a2b3c",car.getVPC() );
        assertEquals(99, num);
        }
 @Test
    public void should_return_failing_taking_with_invalidParkingCertificate(){
        Parking park = new Parking();
        Car car = new Car();
        car.setVPC("1a2b3c");
        car.setInVPC("1a2b3d");
        boolean result=car.getInVPC();
    assertEquals(false,result);
        }
    @Test
    public void should_return_successfully_first_taking_failing_second_taking(){
        Parking park = new Parking();
        Car car = new Car();
        car.setVPC("1a2b3c");
        park.setS(100);
       int num=park.park();
        assertEquals(99, num);
        assertEquals("1a2b3c",car.getVPC() );
        car.getVPC();
        assertEquals(99, num);
        }




}
