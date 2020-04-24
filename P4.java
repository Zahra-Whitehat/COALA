package com.example.coala;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* renamed from: com.example.vitrail.P4 */
public class P4 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_page5);
        ((Button) findViewById(R.id.btn9)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                P4.this.startActivity(new Intent(P4.this, MainActivity.class));
                P4.this.finish();
            }
        });
    }
}
