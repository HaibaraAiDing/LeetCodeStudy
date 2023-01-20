public class Code01_Print32bit {

    public static void main(String[] args) {
        //32位
        int num = 758231234;
        print(num);
        print(num >> 2);//右移两位，去1，在前面补0
    }

    public static void print(int num){
        for (int i = 31; i >= 0; i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");//1<<31表示当前数字向左移31位
        }
        System.out.println();
    }

}
