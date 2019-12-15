package com.example.helloworld2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import stack.*;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   public TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button buttoneq = (Button) findViewById(R.id.button_eq);
        Button button_point = (Button)findViewById(R.id.button_point);
        Button button_present = (Button)findViewById(R.id.button_persent);
        Button button_c = (Button)findViewById(R.id.button_c);
        Button button_back = (Button)findViewById(R.id.button_back);

        Button button_add = (Button)findViewById(R.id.button_add);
        Button button_minus = (Button)findViewById(R.id.button_minus);
        Button button_muti = (Button)findViewById(R.id.button_muti);
        Button button_sup = (Button)findViewById(R.id.button_sup);


        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Configuration mConfiguration = this.getResources().getConfiguration(); //获取设置的配置信息
        int ori = mConfiguration.orientation; //获取屏幕方向
if(ori == mConfiguration.ORIENTATION_LANDSCAPE) {
    Button button_sin = (Button) findViewById(R.id.button_sin);
    Button button_cos = (Button) findViewById(R.id.button_cos);
    Button button_left_bracket = (Button) findViewById(R.id.button_left_bracket);
    Button button_right_bracket = (Button) findViewById(R.id.button_right_bracket);
    Button button_pi = (Button) findViewById(R.id.button_pi);
    Button button_sqrt = (Button) findViewById(R.id.button_sqrt);
    Button button_xx = (Button) findViewById(R.id.button_xx);
    Button button_xxx = (Button) findViewById(R.id.button_xxx);
    button_left_bracket.setOnClickListener(new Click());
    button_right_bracket.setOnClickListener(new Click());
    button_sin.setOnClickListener(new Click());
    button_cos.setOnClickListener(new Click());
    button_pi.setOnClickListener(new Click());
    button_sqrt.setOnClickListener(new Click());
    button_xx.setOnClickListener(new Click());
    button_xxx.setOnClickListener(new Click());

}
       txtResult = findViewById(R.id.text_view);
        buttoneq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String str = txtResult.getText().toString();
                String result = calculator(str);

                if (result == "error")
                {

                }else
                txtResult.setText(result);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"0");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*0");
                    else
                        txtResult.setText(txtResult.getText()+"0");
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"1");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*1");
                    else
                        txtResult.setText(txtResult.getText()+"1");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"2");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*2");
                    else
                        txtResult.setText(txtResult.getText()+"2");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"3");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*3");
                    else
                        txtResult.setText(txtResult.getText()+"3");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"4");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*4");
                    else
                        txtResult.setText(txtResult.getText()+"4");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"5");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*5");
                    else
                        txtResult.setText(txtResult.getText()+"5");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"6");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*6");
                    else
                        txtResult.setText(txtResult.getText()+"6");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"7");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*7");
                    else
                        txtResult.setText(txtResult.getText()+"7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"8");
                else{
                    if(temp.charAt(temp.length()-1) == ')')
                        txtResult.setText(txtResult.getText()+"*8");
                    else
                        txtResult.setText(txtResult.getText()+"8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if(temp.length() == 0)
                    txtResult.setText(txtResult.getText()+"9");
                else{
                if(temp.charAt(temp.length()-1) == ')')
                    txtResult.setText(txtResult.getText()+"*9");
                else
                txtResult.setText(txtResult.getText()+"9");
                }
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = txtResult.getText().toString();
                int i=0;
                if(str.length()==0)
                    txtResult.setText(txtResult.getText()+"0.");
                else {
                    if( str.charAt(str.length()-1 )== '+' || str.charAt(str.length()-1 )== '-' || str.charAt(str.length()-1 )== '*'|| str.charAt(str.length()-1 )== '/' || str.charAt(str.length()-1 )== '(' )
                        txtResult.setText(txtResult.getText()+"0.");
                    else {
                        if(str.charAt(str.length()-1 )== ')')
                            txtResult.setText(txtResult.getText()+"*0.");
                        else{
                        for ( i = str.length() - 1; i > 0; i--) {
                            if(str.charAt(i)=='(' || str.charAt(i)==')' || str.charAt(i)=='+' ||str.charAt(i)=='-'|| str.charAt(i)=='*' || str.charAt(i)=='/')
                                break;
                        }

                            String temp = str.substring(i);
                            if (temp.indexOf(".") > 0)
                                Toast.makeText(MainActivity.this, "非法输入", Toast.LENGTH_LONG).show();
                            else
                                txtResult.setText(txtResult.getText() + ".");
                       }
                    }
                }
            }
        });
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                txtResult.setText(temp.substring(0,temp.length()-1));
            }
        });
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText("");
            }
        });
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if (temp.length()==0)
                    txtResult.setText("0");
                temp = txtResult.getText().toString();
                if(temp.charAt(temp.length()-1) == '+' || temp.charAt(temp.length()-1) == '-' || temp.charAt(temp.length()-1) == '*' || temp.charAt(temp.length()-1) == '/' || temp.charAt(temp.length()-1) == '(')
                    Toast.makeText(MainActivity.this,"非法输入",Toast.LENGTH_LONG).show();
                else
                txtResult.setText(txtResult.getText()+"+");
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if (temp.length()==0)
                    txtResult.setText("0");
                temp = txtResult.getText().toString();
                if(temp.charAt(temp.length()-1) == '+' || temp.charAt(temp.length()-1) == '-' || temp.charAt(temp.length()-1) == '*' || temp.charAt(temp.length()-1) == '/' || temp.charAt(temp.length()-1) == '(')
                    Toast.makeText(MainActivity.this,"非法输入",Toast.LENGTH_LONG).show();
                else
                txtResult.setText(txtResult.getText()+"-");
            }
        });
        button_muti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if (temp.length()==0)
                    txtResult.setText("1");
                temp = txtResult.getText().toString();
                if(temp.charAt(temp.length()-1) == '+' || temp.charAt(temp.length()-1) == '-' || temp.charAt(temp.length()-1) == '*' || temp.charAt(temp.length()-1) == '/' || temp.charAt(temp.length()-1) == '(')
                    Toast.makeText(MainActivity.this,"非法输入",Toast.LENGTH_LONG).show();
                else
                txtResult.setText(txtResult.getText()+"*");
            }
        });
        button_sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtResult.getText().toString();
                if (temp.length()==0)
                    txtResult.setText("0");
                temp = txtResult.getText().toString();
                if(temp.charAt(temp.length()-1) == '+' || temp.charAt(temp.length()-1) == '-' || temp.charAt(temp.length()-1) == '*' || temp.charAt(temp.length()-1) == '/' || temp.charAt(temp.length()-1) == '(')
                    Toast.makeText(MainActivity.this,"非法输入",Toast.LENGTH_LONG).show();
                else

                txtResult.setText(txtResult.getText()+"/");
            }
        });



        button_present.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp =  txtResult.getText().toString();
                if(temp.charAt(temp.length()-1) == '+' || temp.charAt(temp.length()-1) == '-' || temp.charAt(temp.length()-1) == '*' ||temp.charAt(temp.length()-1) == '/')
                    Toast.makeText(MainActivity.this, "非法输入", Toast.LENGTH_LONG).show();
                else
                    txtResult.setText(txtResult.getText()+"%");
            }
        });
    }
    String calculator(String str){
        int lb=0;
        int rb=0;
        String  result;
        lb=tools.charCounter(str,'(');
        rb=tools.charCounter(str,')');
        if(lb==rb) {
            int index = 0;
            StringBuffer sb = new StringBuffer();
            sb.append(str);
            int count = tools.charCounter(str,'%');
            for(int i=0;i<count;i++){
                index = sb.indexOf("%");
                sb.replace(index,index+1,"*0.01");
            }
            result=stack.stack_cal(sb.toString()).toString();
            return result;
        }
        else {
            Toast.makeText(MainActivity.this, "输入的括号不匹配", Toast.LENGTH_LONG).show();
            return "error";
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.exit:
                finish();
                break;
            case R.id.help:
                Toast.makeText(this,"this is help",Toast.LENGTH_SHORT).show();
                break;
            case R.id.unit:{
                Intent intent = new Intent(MainActivity.this, unit.class);
                startActivity(intent);
            }
            break;
                default:


        }
        return true;
    }
    class  Click implements View.OnClickListener {
        TextView txtResult = findViewById(R.id.text_view);

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_sin:
                {
                    double sin;
                    String temp = txtResult.getText().toString();
                    String result;
                    result = calculator(temp);
                    if(result == "error"){

                    }else{
                        sin = Math.sin(Double.valueOf(result));
                        txtResult.setText(String.valueOf(sin));
                    }

                }
                break;

                case R.id.button_cos:{
                    double cos;
                    String temp = txtResult.getText().toString();
                    String result;
                    result = calculator(temp);
                    if(result == "error"){

                    }else{
                        cos= Math.cos(Double.valueOf(result));
                        txtResult.setText(String.valueOf(cos));
                    }

                }
                break;

                case R.id.button_left_bracket: {
                    String temp = txtResult.getText().toString();
                    if (temp.length() == 0)
                        txtResult.setText(txtResult.getText() + "(");
                    else {
                        if (temp.charAt(temp.length() - 1) > '1' && temp.charAt(temp.length() - 1) < '9' || temp.charAt(temp.length() - 1) == '.')
                            txtResult.setText(txtResult.getText() + "*(");
                        else
                            txtResult.setText(txtResult.getText() + "(");
                    }

                }
                break;

                case R.id.button_right_bracket: {
                    String temp = txtResult.getText().toString();
                    if (temp.length() == 0) {
                        Toast.makeText(MainActivity.this, "非法输入", Toast.LENGTH_LONG).show();
                        //txtResult.setText(txtResult.getText() + ")");
                    }
                    else {
                        if (temp.charAt(temp.length() - 1) == '+' || temp.charAt(temp.length() - 1) == '-' || temp.charAt(temp.length() - 1) == '*' || temp.charAt(temp.length() - 1) == '/' || temp.charAt(temp.length() - 1) == '(') {
                            Toast.makeText(MainActivity.this, "非法输入", Toast.LENGTH_LONG).show();
                        }
                        else
                            txtResult.setText(txtResult.getText() + ")");
                    }

                }
                break;
                case R.id.button_pi:{
                    String temp = txtResult.getText().toString();
                    if(temp.charAt(temp.length() - 1) == '+' || temp.charAt(temp.length() - 1) == '-' || temp.charAt(temp.length() - 1) == '*' || temp.charAt(temp.length() - 1) == '/' || temp.charAt(temp.length() - 1) == '(')
                    txtResult.setText(txtResult.getText()+"3.14");
                    else
                        txtResult.setText(txtResult.getText()+"*3.14");
                }
                break;
                case R.id.button_sqrt:{
                    double sqrt;
                    String temp = txtResult.getText().toString();
                    String result;
                    result = calculator(temp);
                    if(Double.valueOf(result)<0)
                        Toast.makeText(MainActivity.this, "非法运算，请验证被开方数是否为正", Toast.LENGTH_LONG).show();
                   else if(result == "error"){
                        Toast.makeText(MainActivity.this, "非法输入", Toast.LENGTH_LONG).show();
                    }else{
                        sqrt= Math.sqrt(Double.valueOf(result));
                        txtResult.setText(String.valueOf(sqrt));
                    }

                }
                break;
                case R.id.button_xx:{
                    double xx;
                    String temp = txtResult.getText().toString();
                    String result;
                    result = calculator(temp);
                    if(result == "error"){

                    }else{
                        xx= Math.pow(Double.valueOf(result),2);
                        txtResult.setText(String.valueOf(xx));
                    }

                }
                break;
                case R.id.button_xxx:{
                    double xxx;
                    String temp = txtResult.getText().toString();
                    String result;
                    result = calculator(temp);
                    if(result == "error"){

                    }else{
                        xxx= Math.pow(Double.valueOf(result),3);
                        txtResult.setText(String.valueOf(xxx));
                    }

                }
                break;
            }

        }
    }

}
