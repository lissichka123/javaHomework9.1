import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class RadioTest {
        @Test
        public void testNext() {
            Radio radio = new Radio();
            radio.setCurrentStation(9);
            radio.next();

            int expected = 0;
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void testPrev() {
            Radio radio = new Radio();
            radio.setCurrentStation(0);
            radio.prev();

            int expected = 9;
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void testIncreaseVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(100);
            radio.increaseVolume();

            int expected = 100;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void testReduceVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(0);
            radio.reduceVolume();

            int expected = 0;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
    }

}