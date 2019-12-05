package com.bawei.myapplication.contract;

import com.bawei.myapplication.model.entity.HomeEntity;

/**
 * description:
 * author: 马方岩
 * date: 2019/12/05 20:36:45
 * update: contract$
 */
public interface IHomeContract {
    interface IModel{
void getHome(ModelCallback modelCallback);
          interface ModelCallback{
              void success(HomeEntity homeEntity);
              void error(Throwable throwable);
          }
    }
    interface IView{
      void success(HomeEntity homeEntity);
      void error(Throwable throwable);
    }
    interface IPresenter{
        void getHome();
    }
}
