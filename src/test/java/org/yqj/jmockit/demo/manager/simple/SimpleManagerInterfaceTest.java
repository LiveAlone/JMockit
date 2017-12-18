package org.yqj.jmockit.demo.manager.simple;

import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;
import org.yqj.jmockit.demo.MockTestBase;

/**
 * @author yaoqijun on 2017-12-18.
 */
public class SimpleManagerInterfaceTest extends MockTestBase{

    @Injectable
    private SimpleManager simpleManager;

    @Test
    public void testInterfaceMock(){
        SimpleManager mockInstance = new MockUp<SimpleManager>(){
            @Mock
            public String getCityName() {
                return "BEIJING(MOCK)";
            }

            @Mock
            public String getAreaName() {
                return "HUABEI(MOCK)";
            }
        }.getMockInstance();

        System.out.println(mockInstance.getCityName());
        System.out.println(mockInstance.getAreaName());
        System.out.println(simpleManager.getCityName());
        System.out.println(simpleManager.getAreaName());
        SimpleManagerImpl simpleManagerImpl = new SimpleManagerImpl();
        System.out.println(simpleManagerImpl.getCityName());
        System.out.println(simpleManagerImpl.getAreaName());
    }
}
