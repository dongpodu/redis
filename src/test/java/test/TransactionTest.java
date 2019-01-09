package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.RedisTemplate;

public class TransactionTest extends BaseTest{
    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void test(){
        BoundSetOperations ops = redisTemplate.boundSetOps("people");
        ops.add("will","duyisong");
        System.out.println(ops.members());
        System.out.println(ops.size());
    }
}
