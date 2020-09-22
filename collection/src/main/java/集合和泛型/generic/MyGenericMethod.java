package 集合和泛型.generic;

import org.junit.Test;

public class MyGenericMethod {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
    @Test
    public void test(){
        MyGenericMethod myGenericMethod = new MyGenericMethod();
//        myGenericMethod.show("aaa");
//        myGenericMethod.show(123);
//        myGenericMethod.show(12.45);
//


    }
}
