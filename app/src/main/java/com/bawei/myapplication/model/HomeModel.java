package com.bawei.myapplication.model;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.myapplication.api.Api;
import com.bawei.myapplication.app.App;
import com.bawei.myapplication.contract.IHomeContract;
import com.bawei.myapplication.model.entity.HomeEntity;
import com.google.gson.Gson;

/**
 * description:
 * author: 马方岩
 * date: 2019/12/05 20:38:31
 * update: homemodel$
 */
public class HomeModel implements IHomeContract.IModel {
    @Override
    public void getHome(final ModelCallback modelCallback) {
        RequestQueue requestQueue = Volley.newRequestQueue(App.getContext());
        StringRequest stringRequest = new StringRequest(Api.HOME_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                HomeEntity homeEntity = new Gson().fromJson(response,HomeEntity.class);
                modelCallback.success(homeEntity);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(stringRequest);
    }
}
