package farkas.tdk.firstndk;

/**
 * author：Administrator 
 * time：2016/8/15.16:50
 *  函数声明文件中的   类名包名函数名   必须与so文件中的相同
 */
public class Load {
    static {
        System.loadLibrary("myFirstLb");
    }
    public native int addInt(int a,int b);//调用库里的方法“addInt”，这是计算a和b两个整数相加
    public native int reduceInt(int a,int b);
}
