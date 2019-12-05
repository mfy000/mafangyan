package com.bawei.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.bawei.myapplication.contract.IHomeContract;
import com.bawei.myapplication.model.entity.HomeEntity;
import com.bawei.myapplication.presenter.HomePresenter;

public class MainActivity extends AppCompatActivity implements IHomeContract.IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HomePresenter homePresenter = new HomePresenter(this);
        homePresenter.getHome();
    }

    @Override
    public void success(HomeEntity homeEntity) {
        Toast.makeText(this,homeEntity.getMessage(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void error(Throwable throwable) {
        Toast.makeText(this,"网络异常",Toast.LENGTH_SHORT).show();
    }
}
