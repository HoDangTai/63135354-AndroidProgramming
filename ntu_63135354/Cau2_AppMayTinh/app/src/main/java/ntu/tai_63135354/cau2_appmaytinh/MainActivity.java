package ntu.tai_63135354.cau2_appmaytinh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    TextView ketquaview, pheptoanview;
    Button buttonBang,buttonCong, buttonTru, buttonChia,buttonNhan;
    Button  button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonC;
    Button buttonCham,buttonAC;
    String pheptoan ;
    String tinhtoan;
    boolean checkbang = false,checkcham = false;
    double so1,so2,ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketquaview.setText("");
                pheptoanview.setText("");
                tinhtoan="";
                pheptoan="";
                checkbang = false;
                checkcham = false;
            }
        });;
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "0";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "1";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "2";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "3";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "4";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "5";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "6";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "7";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "8";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += "9";
                    ketquaview.setText(tinhtoan);
                }
            }
        });
        buttonCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkcham == false){
                    tinhtoan = ketquaview.getText().toString();
                    tinhtoan += ".";
                    ketquaview.setText(tinhtoan);
                    checkcham = true;
                }
            }
        });

        buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ketquaview.getText().toString().equals("")){
                    so1 = 0;
                    ketquaview.setText("");
                }else {
                    so1 = Double.parseDouble(ketquaview.getText().toString());
                    pheptoan = "+";
                    pheptoanview.setText(ketquaview.getText().toString() + "+");
                    ketquaview.setText("");
                    checkcham = false;
                    checkbang = false;
                }
            }
        });
        buttonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ketquaview.getText().toString().equals("")){
                    so1 = 0;
                    ketquaview.setText("");
                }else {
                    so1 = Double.parseDouble(ketquaview.getText().toString());
                    pheptoan = "-";
                    pheptoanview.setText(ketquaview.getText().toString() + "-");
                    ketquaview.setText("");
                    checkcham = false;
                    checkbang = false;
                }
            }
        });
        buttonNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ketquaview.getText().toString().equals("")){
                    so1 = 0;
                    ketquaview.setText("");
                }else {
                    so1 = Double.parseDouble(ketquaview.getText().toString());
                    pheptoan = "*";
                    pheptoanview.setText(ketquaview.getText().toString() + "*");
                    ketquaview.setText("");
                    checkcham = false;
                    checkbang = false;
                }
            }
        });
        buttonChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ketquaview.getText().toString().equals("")){
                    so1 = 0;
                    ketquaview.setText("");
                }else {
                    so1 = Double.parseDouble(ketquaview.getText().toString());
                    pheptoan = "/";
                    pheptoanview.setText(ketquaview.getText().toString() + "/");
                    ketquaview.setText("");
                    checkcham = false;
                    checkbang = false;
                }
            }
        });
        buttonBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkbang) {
                    if (ketquaview.getText().toString().equals("")) {
                        ketquaview.setText("");
                    } else {
                        so2 = Double.parseDouble(ketquaview.getText().toString());
                        if (pheptoan.equals("+")) {
                            ketqua = so1 + so2;
                            ketquaview.setText(String.valueOf(ketqua));
                            pheptoanview.setText("");
                        } else if (pheptoan.equals("-")) {
                            ketqua = so1 - so2;
                            ketquaview.setText(String.valueOf(ketqua));
                            pheptoanview.setText("");
                        } else if (pheptoan.equals("*")) {
                            ketqua = so1 * so2;
                            ketquaview.setText(String.valueOf(ketqua));
                            pheptoanview.setText("");
                        } else if (pheptoan.equals("/")) {
                            ketqua = so1 / so2;
                            ketquaview.setText(String.valueOf(ketqua));
                            pheptoanview.setText("");
                        }
                        checkbang = true;
                    }
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = ketquaview.getText().toString();
                if(!val.isEmpty()){
                    val = val.substring(0,tinhtoan.length()-1);
                    ketquaview.setText(val);
                }
            }
        });
    }

    void anhxa(){
        ketquaview = findViewById(R.id.Ketqua_View);
        pheptoanview = findViewById(R.id.Pheptoan_View);
        buttonBang = findViewById(R.id.buttonBang);
        buttonCong = findViewById(R.id.buttonCong);
        buttonTru = findViewById(R.id.buttonTru);
        buttonChia = findViewById(R.id.buttonChia);
        buttonNhan = findViewById(R.id.buttonNhan);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonC = findViewById(R.id.buttonC);
        buttonCham = findViewById(R.id.button_Cham);
        buttonAC = findViewById(R.id.buttonAC);
    }

}