package com.example.jngoogle.keionbu.network.service;

/**
 * Created by jngoogle on 2017/2/23 15:01.
 * email: guyuanhaofan@cnicg.cn
 */

import com.example.jngoogle.keionbu.network.entity.AdsEntity;
import com.example.jngoogle.keionbu.network.entity.SearchEntity;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 新曲板块
 * 广告宣传位的轮播宣传图
 */

/**
 * from:     anroid
 * version:  5.6.5.6
 * format:   json
 * 以上参数非必须
 * <p>
 * =============================
 * method 和 num 为必须的参数
 * num 获取宣传图的总数
 */
public interface ISearchWordsService {
    @GET("v1/restserver/ting?")
    Observable<SearchEntity> getSearchWords(@Query("method") String method);
}
