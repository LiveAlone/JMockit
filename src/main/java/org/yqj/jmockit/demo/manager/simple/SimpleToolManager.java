package org.yqj.jmockit.demo.manager.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yaoqijun on 2017-12-18.
 */
@Slf4j
public class SimpleToolManager {

    public String fun1(String param){
//        log.info("real fun1 called param :{}", param);
        return "result fun1 " + param;
    }

    private String fun2(String param){
//        log.info("real fun2 called param :{}", param);
        return "result fun2 " + param;
    }

    public String fun3(String param){
//        log.info("real fun3 called param :{}", param);
        return "result fun3 " + param;
    }

    public String fun4(String param){
        return fun2(param);
    }
}
