package com.sunfusheng.gank.http;

import com.sunfusheng.gank.Constants;
import com.sunfusheng.gank.model.GankDay;
import com.sunfusheng.gank.util.update.VersionEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * @author by sunfusheng on 2017/1/17.
 */
public interface ApiService {

    @Headers("Cache-Control: public, max-age=3600")
    @GET("day/{year}/{month}/{day}")
    Observable<GankDay> getGankDay(@Path("year") int year, @Path("month") int month, @Path("day") int day);

    @GET(Constants.URL_APP_VERSION)
    Observable<VersionEntity> checkVersion();
}
