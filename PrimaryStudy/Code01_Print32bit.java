public class Code01_Print32bit {//位运算，打印一个数的32位二进制表示
    /*
    Important：负数以补码的形式被存储起来
     */
    public static void main(String[] args) {
        //32位
        int num = 758231234;
        print(num);
        print(num >> 2);//右移两位，去1，在前面补0，不会报错
        System.out.println("=======================");
        int a = Integer.MIN_VALUE;
        print(a);
        System.out.println("=======================");
        int b = 24387324;
        int c = ~b;//取反
        print(b);
        print(c);
        System.out.println("=======================");
        print(-5);//结果符号位不变，取反+1就是-5
        System.out.println("=======================");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("=======================");
        print(c | b);
        print(c & b);
        print(c ^ b);
        System.out.println("=======================");
        int d = -4234;
        print(d >>> 1);//不带符号右移 用0补
        print(d >> 1);//带符号右移 用符号位补
        System.out.println("=======================");
        int e = -34;
        int f = -e;//相反数
        int g = (~e + 1);//各位取反+1也是相反数，按位来理解
        System.out.println(f);
        System.out.println(g);
    }

    public static void print(int num){
        for (int i = 31; i >= 0; i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");//1<<31表示当前数字向左移31位
        }
        System.out.println();//换行
    }

}
