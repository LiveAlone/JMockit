package org.yqj.jmockit.demo.manager.simple;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.Verifications;
import org.junit.Test;
import org.yqj.jmockit.demo.MockTestBase;

/**
 * @author yaoqijun on 2017-12-18.
 */
public class UseSimpleToolManagerTest extends MockTestBase{

    @Tested(fullyInitialized = true)
    private UseSimpleToolManager useSimpleToolManager;

    @Injectable
    private SimpleToolManager simpleToolManager;

    @Test
    public void func1Test(){
        new Expectations(){
            {
                simpleToolManager.fun1(anyString);
                result = "(TEST MOCK)";
            }
        };

        System.out.println(useSimpleToolManager.func1("qijun"));

        new Verifications(){
            {
                simpleToolManager.fun1(anyString);
                times = 1;
            }
        };
    }

}
