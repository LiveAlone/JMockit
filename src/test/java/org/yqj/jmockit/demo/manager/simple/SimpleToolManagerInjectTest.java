package org.yqj.jmockit.demo.manager.simple;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Verifications;
import org.junit.Test;
import org.yqj.jmockit.demo.MockTestBase;

/**
 * @author yaoqijun on 2017-12-18.
 */
public class SimpleToolManagerInjectTest extends MockTestBase{

    @Injectable
    private SimpleToolManager simpleToolManager;

    @Test
    public void testExpectation() {

        //未mock函数返回null
        new Expectations() {
            {
                simpleToolManager.fun1(anyString);
                result = "MOCK";
            }
        };

        System.out.println(simpleToolManager.fun1("param"));
        System.out.println(simpleToolManager.fun3("param"));
        System.out.println(new SimpleToolManager().fun1("param"));

        new Verifications() {
            {
                simpleToolManager.fun1(anyString);
                times = 1;
            }
        };
    }
}
