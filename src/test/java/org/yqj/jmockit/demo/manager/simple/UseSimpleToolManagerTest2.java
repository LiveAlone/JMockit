package org.yqj.jmockit.demo.manager.simple;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Test;
import org.yqj.jmockit.demo.MockTestBase;

public class UseSimpleToolManagerTest2 extends MockTestBase{

    @Mocked
    private UseSimpleToolManager useSimpleToolManager;

    @Injectable
    private SimpleToolManager simpleToolManager;

    @Test
    public void func1Test(){
        new Expectations(){
            {
                simpleToolManager.fun1(anyString);
                result = "hello world";
            }
        };

        System.out.println(useSimpleToolManager.func1("test"));

        new Verifications(){
            {
                simpleToolManager.fun1("test");
                times = 1;
            }
        };

    }
}
