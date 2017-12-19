package org.yqj.jmockit.demo.manager.simple;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import mockit.Verifications;
import org.junit.Test;
import org.yqj.jmockit.demo.MockTestBase;

public class UseSimpleToolManagerTest2 extends MockTestBase{

    @Mocked
    private UseSimpleToolManager useSimpleToolManager;

//    @Injectable
//    private SimpleToolManager simpleToolManager;

    @Test
    public void func1Test(){
        new Expectations(){
            {
//                simpleToolManager.fun1(anyString);
//                result = "hello world";
                useSimpleToolManager.func1(anyString);
                result = "hello test mock";
            }
        };

        System.out.println(useSimpleToolManager.func1("test"));

        new Verifications(){
            {
                useSimpleToolManager.func1(anyString);
                times = 1;
            }
        };

    }
}
