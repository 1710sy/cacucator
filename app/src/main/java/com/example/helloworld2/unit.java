package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class unit extends AppCompatActivity {
    String[] length = new String[]{"cm","dm","m"};
    int len_left=2,vom_left=2,MC_left=2;
    int len_right = 2,vom_right=2,MC_right=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);


        Button button_length = (Button)findViewById(R.id.length_button);
        Button button_volume = (Button)findViewById(R.id.volume_button);
        Button button_Metric_conversion = (Button)findViewById(R.id.Metric_conversion_button);
        Button button_back = (Button)findViewById(R.id.button_back);
        button_length.setOnClickListener(new Click());
        button_volume.setOnClickListener(new Click());
        button_back.setOnClickListener(new Click());
        button_Metric_conversion.setOnClickListener((new Click()));
        setSpinner();
    }
    protected  void setSpinner(){
        Spinner sp_length_l = (Spinner)findViewById(R.id.Spinner_length_l);
        Spinner sp_length_r = (Spinner)findViewById(R.id.Spinner_length_r);
        Spinner sp_volume_l = (Spinner)findViewById(R.id.Spinner_volume_l);
        Spinner sp_volume_r = (Spinner)findViewById(R.id.Spinner_volume_r);
        Spinner sp_Metric_conversion_l = (Spinner)findViewById(R.id.Spinner_Metric_conversion_l);
        Spinner sp_Metric_conversion_r = (Spinner)findViewById(R.id.Spinner_Metric_conversion_r);


        sp_length_l.setSelection(2,true);
        sp_length_r.setSelection(2,true);
        sp_volume_l.setSelection(2,true);
        sp_volume_r.setSelection(2,true);
        sp_Metric_conversion_l.setSelection(2,true);
        sp_Metric_conversion_r.setSelection(2,true);
        sp_length_l.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                len_left = i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp_length_r.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                len_right = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        sp_volume_l.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                vom_left = i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        sp_volume_r.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                vom_right = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp_Metric_conversion_l.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                MC_left= i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        sp_Metric_conversion_r.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                MC_right= i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    class  Click implements View.OnClickListener{
        EditText length_txt_l = (EditText)findViewById(R.id.length_l);
        EditText volume_txt_l = (EditText)findViewById(R.id.volume_l);
        EditText Metric_conversion_txt_l=(EditText)findViewById(R.id.Metric_conversion_l);
        TextView length_txt_r = (TextView)findViewById(R.id.length_r);
        TextView volume_txt_r = (TextView)findViewById(R.id.volume_r);
        TextView Metric_conversion_txt_r = (TextView)findViewById(R.id.Metric_conversion_r);

        double temp = 0;
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.length_button:{
                    temp = Double.valueOf(length_txt_l.getText().toString());
                    temp = temp*Math.pow(10,len_left+1)/Math.pow(10,len_right+1);
                    length_txt_r.setText(String.valueOf(temp));
                }break;
                case R.id.volume_button:{
                    temp = Double.valueOf(volume_txt_l.getText().toString());
                    temp = temp*Math.pow(100,vom_left+1)/Math.pow(100,vom_right+1);
                    volume_txt_r.setText(String.valueOf(temp));
                }break;
                case R.id.Metric_conversion_button:{
                        switch (MC_left){
                            case 0:{
                                if(MC_right==0)
                                    Metric_conversion_txt_r.setText(Metric_conversion_txt_l.getText());
                                else if(MC_right==1){
                                    int temp=Integer.valueOf(Metric_conversion_txt_l.getText().toString(),2);
                                    Metric_conversion_txt_r.setText(Integer.toOctalString(temp));
                                }else {
                                    Metric_conversion_txt_r.setText(Integer.valueOf(Metric_conversion_txt_l.getText().toString(),2).toString());
                                }
                            }break;
                            case 1:{
                                if(MC_right==0){
                                    int temp=Integer.valueOf(Metric_conversion_txt_l.getText().toString(),8);
                                    Metric_conversion_txt_r.setText(Integer.toBinaryString(temp));
                                }else if(MC_right==1)
                                    Metric_conversion_txt_r.setText(Metric_conversion_txt_l.getText());
                                else{
                                    Metric_conversion_txt_r.setText(Integer.valueOf(Metric_conversion_txt_l.getText().toString(),8).toString());
                                }
                            }break;
                            case 2:{
                                if(MC_right==0)
                                    Metric_conversion_txt_r.setText(Integer.toBinaryString(Integer.valueOf(Metric_conversion_txt_l.getText().toString(),10)));
                                else if(MC_right == 1)
                                    Metric_conversion_txt_r.setText(Integer.toOctalString(Integer.valueOf(Metric_conversion_txt_l.getText().toString(),10)));
                                else
                                    Metric_conversion_txt_r.setText(Metric_conversion_txt_l.getText());

                            }
                        }
                }break;
                case R.id.button_back:{
                    unit.this.finish();
                }
            }
        }

    }

}
