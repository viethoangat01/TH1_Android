package com.example.th1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.th1_android.utils.Function;

public class MainActivity extends AppCompatActivity {
    EditText edtA,edtB;
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView txtResult;
    float numberA,numberB;
    float result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initVariable();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aAdd=edtA.getText().toString();
                String bString=edtB.getText().toString();
                if(Function.checkEmpty(aAdd,bString)){
                    if(aAdd.length()==0) edtA.setError("Vui lòng nhập số A");
                    if(bString.length()==0) edtB.setError("Vui lòng nhập số B");
                }else{
                    if(Function.isFloat(Function.calAdd(aAdd,bString))){
                        txtResult.setText(Function.calAdd(aAdd,bString)+"");
                    }else txtResult.setText((int)(Math.round(Function.calAdd(aAdd,bString)))+"");
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aSub=edtA.getText().toString();
                String bSub=edtB.getText().toString();
                if(Function.checkEmpty(aSub,bSub)){
                    if(aSub.length()==0) edtA.setError("Vui lòng nhập số A");
                    if(bSub.length()==0) edtB.setError("Vui lòng nhập số B");
                }else{
                    if(Function.isFloat(Function.calSub(aSub,bSub))){
                        txtResult.setText(Function.calSub(aSub,bSub)+"");
                    }else txtResult.setText((int)(Math.round(Function.calSub(aSub,bSub)))+"");
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aMul=edtA.getText().toString();
                String bMul=edtB.getText().toString();
                if(Function.checkEmpty(aMul,bMul)){
                    if(aMul.length()==0) edtA.setError("Vui lòng nhập số A");
                    if(bMul.length()==0) edtB.setError("Vui lòng nhập số B");
                }else{
                    if(Function.isFloat(Function.calMul(aMul,bMul))){
                        txtResult.setText(Function.calMul(aMul,bMul)+"");
                    }else txtResult.setText((int)(Math.round(Function.calMul(aMul,bMul)))+"");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aDiv=edtA.getText().toString();
                String bDiv=edtB.getText().toString();
                if(Function.checkEmpty(aDiv,bDiv)){
                    if(aDiv.length()==0) edtA.setError("Vui lòng nhập số A");
                    if(bDiv.length()==0) edtB.setError("Vui lòng nhập số B");
                }else{
                    if(Function.isFloat(Function.calDiv(aDiv,bDiv))){
                        txtResult.setText(Function.calDiv(aDiv,bDiv)+"");
                    }else txtResult.setText((int)(Math.round(Function.calDiv(aDiv,bDiv)))+"");
                }
            }
        });
    }

    private void initVariable() {
        numberA=0;
        numberB=0;
    }

    private void initView() {
        edtA=(EditText) findViewById(R.id.edittext_main_inputA);
        edtB=(EditText) findViewById(R.id.edittext_main_inputB);
        btnAdd=(Button) findViewById(R.id.button_main_add);
        btnSub=(Button) findViewById(R.id.button_main_sub);
        btnMul=(Button) findViewById(R.id.button_main_mul);
        btnDiv=(Button) findViewById(R.id.button_main_div);
        txtResult=(TextView) findViewById(R.id.textview_main_result);
    }
}
