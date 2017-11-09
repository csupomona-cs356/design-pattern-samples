package edu.cpp.proxypattern;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.ImageView;

/**
 * Created by yusun on 11/7/17.
 */

public class SmartImageLoader implements IImageLoader {

    private String url;
    private ImageView imageView;
    private Context context;

    private ImageLoader realImageLoader;

    public SmartImageLoader(String url, ImageView imageView, Context context) {
        this.url = url;
        this.imageView = imageView;
        this.context = context;
    }

    public void loadImage() {
        imageView.setImageResource(R.drawable.placeholder);

        if (wifiIsOn()) {
            realImageLoader = new ImageLoader(url, imageView, context);
            realImageLoader.loadImage();
        }
    }

    private boolean wifiIsOn() {
        ConnectivityManager connectionManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiCheck = connectionManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiCheck.isConnected()) {
            return true;
        } else {
            return false;
        }
    }
}
