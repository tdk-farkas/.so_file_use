package farksa.tdk.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import farkas.tdk.firstndk.Load;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用so文件实现的函数
        Load load = new Load();
        Toast.makeText(this,""+ load.addInt(1,2),Toast.LENGTH_LONG).show(); 
    }
}