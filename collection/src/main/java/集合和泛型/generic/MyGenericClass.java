package 集合和泛型.generic;

import org.junit.Test;


public class MyGenericClass<MVP> {
    //没有MVP类型，在这里代表 未知的一种数据类型 未来传递什么就是什么类型
    private MVP mvp;

    public void setMVP(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMVP() {
        return mvp;
    }

    @Test
    public void test(){
        // 创建一个泛型为String的类
       MyGenericClass<String> my = new MyGenericClass<String>();
        // 调用setMVP
        my.setMVP("大胡子登登");
        // 调用getMVP
        String mvp = my.getMVP();
        System.out.println(mvp.getClass());
        System.out.println(mvp);
        //创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<Integer>();
        my2.setMVP(123);
        Integer mvp2 = my2.getMVP();
        System.out.println(mvp2.getClass());
        System.out.println(mvp2);
    }
}
