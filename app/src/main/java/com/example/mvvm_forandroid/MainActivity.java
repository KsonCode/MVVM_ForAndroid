package com.example.mvvm_forandroid;

import android.app.ActivityManager;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvvm_forandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    UserBean userBean;
    ModelBean modelBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserBean userBean = new UserBean();
        userBean.name = "kson";
        binding.setVariable(BR.userBean,userBean);

//        binding.setUserBean(userBean);


    }
}
