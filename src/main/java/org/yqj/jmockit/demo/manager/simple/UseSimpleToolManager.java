package org.yqj.jmockit.demo.manager.simple;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yaoqijun on 2017-12-18.
 */
public class UseSimpleToolManager {

    @Getter
    @Setter
    private SimpleToolManager simpleToolManager;

    public String func1(String param){
        return simpleToolManager.fun1(param);
    }

}
