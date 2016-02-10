package com.neds.animationssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by mleano on 2/10/2016.
 */
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    AnimationsUtils anim;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        anim = new AnimationsUtils(getApplicationContext());
        imageView = (ImageView) findViewById(R.id.imageView);
        createWidgets();
    }

    Button btnZoomIn, btnFadeIn;
    Button btnZoomOut, btnFadeOut;
    Button btnClockwise, btnSlideUp, btnSlideLeft;
    Button btnCounter, btnSlideDown, btnSlideRight;
    Button btnBounce, btnBlink, btnFlip;


    private void createWidgets() {

        btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
        btnZoomIn.setOnClickListener(this);

        btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        btnFadeIn.setOnClickListener(this);

        btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
        btnZoomOut.setOnClickListener(this);

        btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
        btnFadeOut.setOnClickListener(this);

        btnClockwise = (Button) findViewById(R.id.btnClockwise);
        btnClockwise.setOnClickListener(this);

        btnSlideUp = (Button) findViewById(R.id.btnSlideUp);
        btnSlideUp.setOnClickListener(this);

        btnSlideLeft = (Button) findViewById(R.id.btnSlideLeft);
        btnSlideLeft.setOnClickListener(this);

        btnCounter = (Button) findViewById(R.id.btnCounter);
        btnCounter.setOnClickListener(this);
        btnSlideDown = (Button) findViewById(R.id.btnSlideDown);
        btnSlideDown.setOnClickListener(this);
        btnSlideRight = (Button) findViewById(R.id.btnSlideRight);
        btnSlideRight.setOnClickListener(this);

        btnBounce = (Button) findViewById(R.id.btnBounce);
        btnBounce.setOnClickListener(this);
        btnBlink = (Button) findViewById(R.id.btnBlink);
        btnBlink.setOnClickListener(this);
        btnFlip = (Button) findViewById(R.id.btnFlip);
        btnFlip.setOnClickListener(this);
    }


//    Button btnZoomIn, btnFadeIn, btnSlideIn;
//    Button btnZoomOut, btnFadeOut, btnSlideOut;
//    Button btnClockwise, btnSlideUp, btnSlideLeft;
//    Button btnCounter, btnSlideDown, btnSlideRight;
//    Button btnBounce, btnBlink, btnFlip;


    @Override
    public void onClick(View v) {
        if (v == btnZoomIn) {
            anim.zoomIn(imageView);
        }
        if (v == btnZoomOut) {
            anim.zoomOut(imageView);
        }
        if (v == btnFadeIn) {
            anim.fadeIn(imageView);
        }

        if (v == btnFadeOut) {
            anim.fadeOut(imageView);
        }

        if (v == btnSlideUp) {
            anim.slideUp(imageView);
        }

        if (v == btnSlideDown) {
            anim.slideDown(imageView);
        }

        if (v == btnClockwise) {
            anim.clockwise(imageView);
        }

        if (v == btnCounter) {
            anim.counter(imageView);
        }


    }
}
