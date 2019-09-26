package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtchieudai, edtchieurong;
    Button btnTinh;
    TextView txtvKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtchieudai=(EditText)findViewById(R.id.editTextcd);
        edtchieurong=(EditText)findViewById(R.id.editTextcr);
        btnTinh=(Button)findViewById(R.id.buttontinh);
        txtvKetqua=(TextView)findViewById(R.id.textViewkq);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1=edtchieudai.getText().toString();
                int cd=Integer.parseInt(chuoi1);
                String chuoi2=edtchieurong.getText().toString();
                int cr=Integer.parseInt(chuoi1);
                int cv=(cd+cr)*2;
                int dt=cd*cr;
                txtvKetqua.setText("Chu vi:"+String.valueOf(cv)+" "+"Dien tich:" + String.valueOf(dt));

            }
        });
    }
}
