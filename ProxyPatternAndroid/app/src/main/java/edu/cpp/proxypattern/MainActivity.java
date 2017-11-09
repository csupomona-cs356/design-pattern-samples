package edu.cpp.proxypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        Button button = (Button) findViewById(R.id.loadImageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IImageLoader imageLoader = new SmartImageLoader(
                        "http://www.planwallpaper.com/static/images/europe-wallpaper-20_Sfblwdr.jpg",
                        imageView, MainActivity.this);
                imageLoader.loadImage();
            }
        });
    }
}
