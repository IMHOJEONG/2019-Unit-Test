import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public void 더하기테스트(){
        CustomCalculator customCalculator = new CustomCalculator(); // 이 메소드에서 쓰기 위해서 객체를 초기화
        int result = customCalculator.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void 마이너스테스트(){
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,2);
        assertTrue(result == 8);
    }
}