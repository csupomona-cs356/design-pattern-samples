package edu.csupomona.cs356.adapter.shorturl;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

public interface GoogleService {

    @Headers({ "Content-type: application/json" })
    @POST("/urlshortener/v1/url")
    public UrlResponse getShortUrl(@Body LongUrl longUrl);

    @GET("/urlshortener/v1/url")
    public UrlResponse expandShortUrl(@Query("shortUrl") String shortUrl);
}
