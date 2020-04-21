package cn.edu.sdwu.android.home.sn170507180130;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeworkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }
    public void startHome1(View view){
        //界面跳转到作业1
        Intent intent=new Intent(this,homeworkActivity1.class);
        startActivity(intent);
    }
    public void startHome2(View view){
        //界面跳转到作业2
        Intent intent=new Intent(this,homeworkActivity2.class);
        startActivity(intent);
    }
    public void startHome3(View view){
        //界面跳转到作业3
        Intent intent=new Intent(this,homeworkActivity3.class);
        startActivity(intent);
    }
    public void startHome4(View view){
        //界面跳转到作业4
        Intent intent=new Intent(this,homeworkActivity4.class);
        startActivity(intent);
    }
    public void startHome5(View view){
        //界面跳转到作业5
        Intent intent=new Intent(this,homeworkActivity5.class);
        startActivity(intent);
    }



}

