package cn.edu.sdwu.android.home.sn170507180130;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class homeworkActivity4 extends AppCompatActivity {
    private Spinner spinner=null;
    private ArrayList list;//数组
    private SimpleAdapter simpleAdapter;//适配器
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework_4);
    }
}
