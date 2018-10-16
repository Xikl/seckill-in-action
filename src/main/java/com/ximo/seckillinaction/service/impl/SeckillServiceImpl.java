package com.ximo.seckillinaction.service.impl;

import com.ximo.seckillinaction.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Ximo
 * @date 2018/10/16 23:20
 */
@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void session() {
        // 编写一个唯一的key
        // 存入session
    }

}
