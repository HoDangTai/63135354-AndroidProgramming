package ntu.tai_63135354.intents_vidu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NhapLieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nhap_lieu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void nhapQuayVe(View v){
        EditText edHT =(EditText) findViewById(R.id.txtHoVaTen);
        EditText edNS =(EditText) findViewById(R.id.txtNamSinh);

        String hoTen = edHT.getText().toString();
        int namSinh = Integer.parseInt(edNS.getText().toString());

        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("HT", hoTen);
        intent.putExtra("NS", namSinh);

        setResult(RESULT_OK, intent);

        finish();
    }
    public void nhapHuy(View v){
        setResult(RESULT_CANCELED);
        finish();
    }
}