package com.bawei.myapplication.presenter;

import com.bawei.myapplication.contract.IHomeContract;
import com.bawei.myapplication.model.HomeModel;
import com.bawei.myapplication.model.entity.HomeEntity;

/**
 * description:
 * author: 马方岩
 * date: 2019/12/05 20:51:54
 * update: homepresenter$
 */
public class HomePresenter implements IHomeContract.IPresenter {
    private HomeModel homeModel;
    private IHomeContract.IView iView;

    public HomePresenter(IHomeContract.IView iView) {
        homeModel=new HomeModel();
        this.iView = iView;
    }

    @Override
    public void getHome() {
        homeModel.getHome(new IHomeContract.IModel.ModelCallback() {
            @Override
            public void success(HomeEntity homeEntity) {
                iView.success(homeEntity);
            }

            @Override
            public void error(Throwable throwable) {
iView.error(throwable);
            }
        });
    }
}
