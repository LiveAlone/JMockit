package org.yqj.jmockit.demo.manager.simple;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Test;
import org.yqj.jmockit.demo.MockTestBase;

/**
 * @author yaoqijun on 2017-12-18.
 */
public class SimpleToolManagerTest extends MockTestBase{

    @Mocked
    SimpleToolManager simpleToolManager;

    @Test
    public void testExpectation() {

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
                times = 2;
            }
        };
    }

}
