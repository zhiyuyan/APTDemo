package com.example.yzy.aptdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.yzy.new_annotation.BindView;
import com.example.yzy.viewinject_api.ViewInjector;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_content)
    TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjector.injectView(this);
        mTvContent.setText("我被绑定了");
    }
}
