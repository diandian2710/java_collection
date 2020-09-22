package 集合和泛型.Set;

public class ChangeArgs {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 62, 431, 2 };
        int sum = getSum(arr);
        System.out.println(sum);
        //  6  7  2 12 2121
        // 求 这几个元素和 6  7  2 12 2121
        int sum2 = getSum(6, 7, 2, 12, 2121);
        System.out.println(sum2);

    }

    /*
     * 完成数组  所有元素的求和 原始写法

      public static int getSum(int[] arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }

        return sum;
      }
    */
    //可变参数写法
    public static int getSum(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
}
//tips: 上述add方法在同一个类中，只能存在一个。因为会发生调用的不确定性
//        注意：如果在方法书写时，这个方法拥有多参数，参数中包含可变参数，可变参数一定要写在参数列表的末尾位置。
