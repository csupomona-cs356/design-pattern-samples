package edu.cpp.proxypattern;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by yusun on 11/7/17.
 */

public class ImageLoader implements IImageLoader {

    private String url;
    private ImageView imageView;
    private Context context;

    public ImageLoader(String url, ImageView imageView, Context context) {
        this.url = url;
        this.imageView = imageView;
        this.context = context;
    }

    public void loadImage() {
        Picasso.with(context).load(url).into(imageView);
    }
}
