package com.example.toast2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

class ToastDemo2 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnShowToast = (Button) findViewById(R.id.btnShowToast);
        btnShowToast.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick (View v) {
//custom made TOAST
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(
                        R.layout.my_toast_layout,
                        (ViewGroup) findViewById(R.id.my_toast_layout_root));
                TextView text = (TextView) layout.findViewById(R.id.text);
                Toast toast = new Toast(getApplicationContext());
                text.setText("Hola mundo \nI'm a fancy Toast");
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
// normal TOAST
                Toast.makeText(getApplicationContext(),
                        "Hola mundo \nnow I am quite normal",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}