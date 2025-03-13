package com.example.bai9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    // Khai báo biến
    Button sendButton;
    EditText sendText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // Ánh xạ các thành phần giao diện
        sendButton = findViewById(R.id.send_button_id);
        sendText = findViewById(R.id.send_text_id);

        // Xử lý sự kiện khi nút được nhấn
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ EditText
                String name = sendText.getText().toString();
                String message = "Hello: " + name;

                // Tạo Intent để chuyển sang SecondActivity
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("message_key", message);

                // Khởi chạy Activity mới
                startActivity(intent);
            }
        });
    }
}
