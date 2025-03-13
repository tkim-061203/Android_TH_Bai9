package com.example.bai9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView receiverMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Ánh xạ TextView
        receiverMsg = findViewById(R.id.received_value_id);

        // Nhận Intent
        Intent intent = getIntent();
        String receivedMessage = intent.getStringExtra("message_key");

        // Hiển thị nội dung nhận được
        receiverMsg.setText(receivedMessage);
    }
}
