package com.jimersylee.shiro.common.shiro;

import com.jimersylee.shiro.common.constant.RedisConstant;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.session.mgt.eis.SessionIdGenerator;
import java.io.Serializable;

/**
 * @Description 自定义SessionId生成器
 * @Author Jimersy Lee
 * @CreateTime 2019/6/11 11:48
 */
public class ShiroSessionIdGenerator implements SessionIdGenerator {
    /**
     * 实现SessionId生成
     * @Author Jimersy Lee
     * @CreateTime 2019/6/11 11:54
     */
    @Override
    public Serializable generateId(Session session) {
        Serializable sessionId = new JavaUuidSessionIdGenerator().generateId(session);
        return String.format(RedisConstant.REDIS_PREFIX_LOGIN, sessionId);
    }
}
