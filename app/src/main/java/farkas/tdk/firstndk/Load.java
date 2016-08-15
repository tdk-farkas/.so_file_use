package farkas.tdk.firstndk;

/**
 * author：Administrator 
 * time：2016/8/15.16:50
 */
public class Load {
    static {
        System.loadLibrary("myFirstLb");
    }
    public native int addInt(int a,int b);//调用库里的方法“addInt”，这是计算a和b两个整数相加
    public native int reduceInt(int a,int b);
}
