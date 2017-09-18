package eshop.user.jedis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class JedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    public  void  addTest(){

        ValueOperations<String, String> valueops = redisTemplate.opsForValue();

        valueops.set("test_key", "test_value");
    }

    @Test
    public void getTest(){
        ValueOperations<String, String> valueops = redisTemplate.opsForValue();
        String value = valueops.get("test_key");

        System.out.print("value is "+value);
    }


}
