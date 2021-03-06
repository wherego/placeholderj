package com.example.jackmiras.placeholderj.api;

import com.example.jackmiras.placeholderj.models.CouponResponse;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by jackson on 14/12/15.
 */
public interface ApiService {

    @GET("/placeholder/coupon")
    Call<CouponResponse> getUserCoupons();

    @GET("/placeholder/coupon")
    Call<CouponResponse> getUserCouponsEmptyList();

    @GET("/placeholder/couponn")
    Call<CouponResponse> getUserCouponsWithError();
}
