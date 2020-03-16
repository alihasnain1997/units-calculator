package com.example.bill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText power,time;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerViews();
    }
    public void registerViews()
    {
        btn=(Button)findViewById(R.id.simpleButton);
        power=(EditText)findViewById(R.id.power);
        time=(EditText)findViewById(R.id.time);
        result=(TextView)findViewById(R.id.result);
    }
    public void temp(View view)
    {
        String str_power=power.getText().toString();
        String str_time=time.getText().toString();
        int int_p=Integer.parseInt(str_power);
        int int_t=Integer.parseInt(str_time);
        int  int_result= (int_t*int_p)/1000;
        String str_Result=Integer.toString(int_result);
        result.setText("Total unit consumed are ="+ str_Result);


        Toast.makeText(this,str_Result,Toast.LENGTH_SHORT).show();
    }

}
