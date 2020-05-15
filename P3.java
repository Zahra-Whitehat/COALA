package com.example.coala;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* renamed from: com.example.vitrail.P3 */
public class P3 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_page4);
        ((Button) findViewById(R.id.btn8)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                P3.this.startActivity(new Intent(P3.this, MainActivity.class));
                P3.this.finish();
            }
        });
    }
}
