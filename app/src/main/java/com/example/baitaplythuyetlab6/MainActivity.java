package com.example.baitaplythuyetlab6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.*;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivUitLogo;

    // Buttons bài tập 1 (XML)
    private Button btnFadeInXml, btnFadeOutXml, btnBlinkXml,
            btnZoomInXml, btnZoomOutXml, btnRotateXml,
            btnMoveXml, btnSlideUpXml, btnBounceXml, btnCombineXml;

    // Buttons bài tập 2 (Code)
    private Button btnFadeInCode, btnFadeOutCode, btnBlinkCode,
            btnZoomInCode, btnZoomOutCode, btnRotateCode,
            btnMoveCode, btnSlideUpCode, btnBounceCode, btnCombineCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsByIds();

        // ===== Bài tập 1: Animation từ XML =====
        setupAnimationsFromXml();

        // ===== Bài tập 2: Animation từ Code =====
        setupAnimationsFromCode();

        // ===== Bài tập 3: Click ImageView để mở SecondActivity =====
        ivUitLogo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    private void findViewsByIds() {
        ivUitLogo = findViewById(R.id.iv_uit_logo);

        // Buttons XML
        btnFadeInXml = findViewById(R.id.btn_fade_in_xml);
        btnFadeOutXml = findViewById(R.id.btn_fade_out_xml);
        btnBlinkXml = findViewById(R.id.btn_blink_xml);
        btnZoomInXml = findViewById(R.id.btn_zoom_in_xml);
        btnZoomOutXml = findViewById(R.id.btn_zoom_out_xml);
        btnRotateXml = findViewById(R.id.btn_rotate_xml);
        btnMoveXml = findViewById(R.id.btn_move_xml);
        btnSlideUpXml = findViewById(R.id.btn_slide_up_xml);
        btnBounceXml = findViewById(R.id.btn_bounce_xml);
        btnCombineXml = findViewById(R.id.btn_combine_xml);

        // Buttons Code
        btnFadeInCode = findViewById(R.id.btn_fade_in_code);
        btnFadeOutCode = findViewById(R.id.btn_fade_out_code);
        btnBlinkCode = findViewById(R.id.btn_blink_code);
        btnZoomInCode = findViewById(R.id.btn_zoom_in_code);
        btnZoomOutCode = findViewById(R.id.btn_zoom_out_code);
        btnRotateCode = findViewById(R.id.btn_rotate_code);
        btnMoveCode = findViewById(R.id.btn_move_code);
        btnSlideUpCode = findViewById(R.id.btn_slide_up_code);
        btnBounceCode = findViewById(R.id.btn_bounce_code);
        btnCombineCode = findViewById(R.id.btn_combine_code);
    }

    // ===== Bài tập 1: Animation từ XML =====
    private void setupAnimationsFromXml() {
        btnFadeInXml.setOnClickListener(v -> {
            Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
            ivUitLogo.startAnimation(fadeIn);
        });

        btnFadeOutXml.setOnClickListener(v -> {
            Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.anim_fade_out);
            ivUitLogo.startAnimation(fadeOut);
        });

        btnBlinkXml.setOnClickListener(v -> {
            Animation blink = AnimationUtils.loadAnimation(this, R.anim.anim_blink);
            ivUitLogo.startAnimation(blink);
        });

        btnZoomInXml.setOnClickListener(v -> {
            Animation zoomIn = AnimationUtils.loadAnimation(this, R.anim.anim_zoom_in);
            ivUitLogo.startAnimation(zoomIn);
        });

        btnZoomOutXml.setOnClickListener(v -> {
            Animation zoomOut = AnimationUtils.loadAnimation(this, R.anim.anim_zoom_out);
            ivUitLogo.startAnimation(zoomOut);
        });

        btnRotateXml.setOnClickListener(v -> {
            Animation rotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
            ivUitLogo.startAnimation(rotate);
        });

        btnMoveXml.setOnClickListener(v -> {
            Animation move = AnimationUtils.loadAnimation(this, R.anim.anim_move);
            ivUitLogo.startAnimation(move);
        });

        btnSlideUpXml.setOnClickListener(v -> {
            Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.anim_slide_up);
            ivUitLogo.startAnimation(slideUp);
        });

        btnBounceXml.setOnClickListener(v -> {
            Animation bounce = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);
            ivUitLogo.startAnimation(bounce);
        });

        btnCombineXml.setOnClickListener(v -> {
            Animation combine = AnimationUtils.loadAnimation(this, R.anim.anim_combine);
            ivUitLogo.startAnimation(combine);
        });
    }

    // ===== Bài tập 2: Animation từ Code =====
    private void setupAnimationsFromCode() {
        // Fade In
        Animation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(1000);
        handleClickAnimationCode(btnFadeInCode, fadeIn);

        // Fade Out
        Animation fadeOut = new AlphaAnimation(1f, 0f);
        fadeOut.setDuration(1000);
        handleClickAnimationCode(btnFadeOutCode, fadeOut);

        // Blink
        Animation blink = new AlphaAnimation(1f, 0f);
        blink.setDuration(300);
        blink.setRepeatMode(Animation.REVERSE);
        blink.setRepeatCount(5);
        handleClickAnimationCode(btnBlinkCode, blink);

        // Zoom In
        Animation zoomIn = new ScaleAnimation(
                0f, 1f, 0f, 1f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        zoomIn.setDuration(500);
        handleClickAnimationCode(btnZoomInCode, zoomIn);

        // Zoom Out
        Animation zoomOut = new ScaleAnimation(
                1f, 0f, 1f, 0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        zoomOut.setDuration(500);
        handleClickAnimationCode(btnZoomOutCode, zoomOut);

        // Rotate
        Animation rotate = new RotateAnimation(
                0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        rotate.setDuration(1000);
        handleClickAnimationCode(btnRotateCode, rotate);

        // Move
        Animation move = new TranslateAnimation(0f, 200f, 0f, 0f);
        move.setDuration(1000);
        handleClickAnimationCode(btnMoveCode, move);

        // Slide Up
        Animation slideUp = new TranslateAnimation(0f, 0f, 200f, 0f);
        slideUp.setDuration(500);
        handleClickAnimationCode(btnSlideUpCode, slideUp);

        // Bounce
        Animation bounce = new TranslateAnimation(0f, 0f, 0f, -100f);
        bounce.setInterpolator(new BounceInterpolator());
        bounce.setDuration(1000);
        handleClickAnimationCode(btnBounceCode, bounce);

        // Combine (Fade + Rotate)
        AnimationSet combine = new AnimationSet(true);
        combine.addAnimation(new AlphaAnimation(0f, 1f));
        combine.addAnimation(new RotateAnimation(
                0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        ));
        combine.setDuration(1000);
        handleClickAnimationCode(btnCombineCode, combine);
    }

    // ===== Hàm dùng chung cho animation từ code =====
    private void handleClickAnimationCode(Button btn, final Animation animation) {
        btn.setOnClickListener(v -> ivUitLogo.startAnimation(animation));
    }
}
