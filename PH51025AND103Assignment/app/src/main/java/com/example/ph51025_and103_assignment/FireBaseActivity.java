package com.example.ph51025_and103_assignment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FireBaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fire_base);

        // Sử dụng Handler để chuyển màn sau 3 giây
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Thực hiện chuyển màn
                startActivity(new Intent(FireBaseActivity.this, LoginActivity.class));
                finish(); // Đảm bảo đóng màn hiện tại
            }
        }, 3000); // 3000 ms = 3 giây

    }
}