package se.iths.martin.apisample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApisampleApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void fail(){
        assertFalse(false);
    }

}
