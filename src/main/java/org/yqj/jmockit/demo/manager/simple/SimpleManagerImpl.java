package org.yqj.jmockit.demo.manager.simple;

/**
 * @author yaoqijun on 2017-12-18.
 */
public class SimpleManagerImpl implements SimpleManager{
    @Override
    public String getCityName() {
        return "default city name";
    }

    @Override
    public String getAreaName() {
        return "default area name";
    }
}
