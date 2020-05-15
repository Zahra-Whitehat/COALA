package com.example.coala;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* renamed from: com.example.vitrail.P2 */
public class P2 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_page3);
        ((Button) findViewById(R.id.btn7)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                P2.this.startActivity(new Intent(P2.this, MainActivity.class));
                P2.this.finish();
            }
        });
    }
}
