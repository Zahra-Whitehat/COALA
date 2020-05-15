package com.example.coala;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* renamed from: com.example.vitrail.P1 */
public class P1 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_page2);
        String ReadFromfile = ReadFromfile("first.txt", this);
        ((Button) findViewById(R.id.btn6)).setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                P1.this.startActivity(new Intent(P1.this, MainActivity.class));
                P1.this.finish();
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060 A[SYNTHETIC, Splitter:B:28:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[Catch:{ Exception -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a A[Catch:{ Exception -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076 A[SYNTHETIC, Splitter:B:38:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007b A[Catch:{ Exception -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080 A[Catch:{ Exception -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String ReadFromfile(java.lang.String r13, android.content.Context r14) {
        
            r12 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r2 = 0
            r6 = 0
            r4 = 0
            android.content.res.Resources r10 = r14.getResources()     // Catch:{ Exception -> 0x0097 }
            android.content.res.AssetManager r10 = r10.getAssets()     // Catch:{ Exception -> 0x0097 }
            r11 = 1
            java.io.InputStream r2 = r10.open(r13, r11)     // Catch:{ Exception -> 0x0097 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0097 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0097 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0099, all -> 0x0090 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0099, all -> 0x0090 }
            java.lang.String r8 = ""
            r3 = 1
        L_0x0022:
            java.lang.String r8 = r5.readLine()     // Catch:{ Exception -> 0x0058, all -> 0x0093 }
            if (r8 != 0) goto L_0x003e
            if (r7 == 0) goto L_0x002d
            r7.close()     // Catch:{ Exception -> 0x0089 }
        L_0x002d:
            if (r2 == 0) goto L_0x0032
            r2.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0032:
            if (r5 == 0) goto L_0x008d
            r5.close()     // Catch:{ Exception -> 0x0089 }
            r4 = r5
            r6 = r7
        L_0x0039:
            java.lang.String r10 = r9.toString()
            return r10
        L_0x003e:
            if (r3 == 0) goto L_0x0045
            r9.append(r8)     // Catch:{ Exception -> 0x0058, all -> 0x0093 }
            r3 = 0
            goto L_0x0022
        L_0x0045:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058, all -> 0x0093 }
            java.lang.String r11 = "\n"
            r10.<init>(r11)     // Catch:{ Exception -> 0x0058, all -> 0x0093 }
            java.lang.StringBuilder r10 = r10.append(r8)     // Catch:{ Exception -> 0x0058, all -> 0x0093 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0058, all -> 0x0093 }
            r9.append(r10)     // Catch:{ Exception -> 0x0058, all -> 0x0093 }
            goto L_0x0022
        L_0x0058:
            r0 = move-exception
            r4 = r5
            r6 = r7
        L_0x005b:
            r0.getMessage()     // Catch:{ all -> 0x0073 }
            if (r6 == 0) goto L_0x0063
            r6.close()     // Catch:{ Exception -> 0x006e }
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ Exception -> 0x006e }
        L_0x0068:
            if (r4 == 0) goto L_0x0039
            r4.close()     // Catch:{ Exception -> 0x006e }
            goto L_0x0039
        L_0x006e:
            r1 = move-exception
            r1.getMessage()
            goto L_0x0039
        L_0x0073:
            r10 = move-exception
        L_0x0074:
            if (r6 == 0) goto L_0x0079
            r6.close()     // Catch:{ Exception -> 0x0084 }
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ Exception -> 0x0084 }
        L_0x007e:
            if (r4 == 0) goto L_0x0083
            r4.close()     // Catch:{ Exception -> 0x0084 }
        L_0x0083:
            throw r10
        L_0x0084:
            r1 = move-exception
            r1.getMessage()
            goto L_0x0083
        L_0x0089:
            r1 = move-exception
            r1.getMessage()
        L_0x008d:
            r4 = r5
            r6 = r7
            goto L_0x0039
        L_0x0090:
            r10 = move-exception
            r6 = r7
            goto L_0x0074
        L_0x0093:
            r10 = move-exception
            r4 = r5
            r6 = r7
            goto L_0x0074
        L_0x0097:
            r0 = move-exception
            goto L_0x005b
        L_0x0099:
            r0 = move-exception
            r6 = r7
            goto L_0x005b
        
        throw new UnsupportedOperationException("Method not decompiled: com.example.vitrail.C0116P1.ReadFromfile(java.lang.String, android.content.Context):java.lang.String");
    }
}
