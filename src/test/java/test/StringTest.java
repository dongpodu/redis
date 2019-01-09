package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

public class StringTest extends BaseTest{
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void test(){
        BoundValueOperations ops = stringRedisTemplate.boundValueOps("name");
        ops.set("will");
        System.out.println(ops.get());
    }
}
