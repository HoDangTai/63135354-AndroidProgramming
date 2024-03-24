package ntu.tai_63135354.cau3_appgioithieu;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần từ layout
        ImageView imageView = findViewById(R.id.imageView);
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewDescription = findViewById(R.id.textViewDescription);

        // Đặt thông tin cho các thành phần
        imageView.setImageResource(R.drawable.hotai4x6); // Đặt hình ảnh của bạn ở đây
        textViewName.setText("Tên của bạn");
        textViewDescription.setText("Mô tả về bản thân của bạn");
    }
}