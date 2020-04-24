package com.example.coala;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.layout_page1);
        ((Button) findViewById(R.id.btn1)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, C0116P1.class));
                MainActivity.this.finish();
            }
        });
        ((Button) findViewById(R.id.btn2)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, C0118P2.class));
                MainActivity.this.finish();
            }
        });
        ((Button) findViewById(R.id.btn3)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, C0120P3.class));
                MainActivity.this.finish();
            }
        });
        ((Button) findViewById(R.id.btn4)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, C0122P4.class));
                MainActivity.this.finish();
            }
        });
        ((Button) findViewById(R.id.btn5)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, C0122P4.class));
                MainActivity.this.finish();
            }
        });
    }
}
