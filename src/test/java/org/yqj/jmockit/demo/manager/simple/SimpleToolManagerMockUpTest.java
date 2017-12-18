package org.yqj.jmockit.demo.manager.simple;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;
import org.yqj.jmockit.demo.MockTestBase;

/**
 * @author yaoqijun on 2017-12-18.
 */
public class SimpleToolManagerMockUpTest extends MockTestBase{

    @Test
    public void testMockUpPrivate(){

        new MockUp<SimpleToolManager>(){
            @Mock
            private String fun2(String str){
                return "(MOCK)";
            }
        };

        SimpleToolManager simpleTool = new SimpleToolManager();
        System.out.println(simpleTool.fun4("param"));
        System.out.println(simpleTool.fun3("param"));
        SimpleToolManager useSimpleTool = new SimpleToolManager();
        System.out.println(useSimpleTool.fun4("param"));
    }

    @Test
    public void testMockUpPublic(){

        new MockUp<SimpleToolManager>(){
            @Mock
            public String fun1(String str){
                return "(MOCK)";
            }
        };

        SimpleToolManager simpleTool = new SimpleToolManager();
        System.out.println(simpleTool.fun1("param"));
        System.out.println(simpleTool.fun3("param"));
        SimpleToolManager useSimpleTool = new SimpleToolManager();
        System.out.println(useSimpleTool.fun1("param"));
    }
}
