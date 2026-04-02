package com.applovin.impl.sdk.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class b {
    private final k a;
    private final Activity b;
    private AlertDialog c;
    private a d;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public b(Activity activity, k kVar) {
        this.a = kVar;
        this.b = activity;
    }

    public void a() {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.c != null) {
                    b.this.c.dismiss();
                }
            }
        });
    }

    public void a(final g gVar, final Runnable runnable) {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.4
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.b);
                builder.setTitle(gVar.an());
                String ao = gVar.ao();
                if (AppLovinSdkUtils.isValidString(ao)) {
                    builder.setMessage(ao);
                }
                builder.setPositiveButton(gVar.ap(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.4.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setCancelable(false);
                b.this.c = builder.show();
            }
        });
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void b() {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.c = new AlertDialog.Builder(b.this.b).setTitle((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bq)).setMessage((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.br)).setCancelable(false).setPositiveButton((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bt), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.d.a();
                    }
                }).setNegativeButton((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bs), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.d.b();
                    }
                }).show();
            }
        });
    }

    public void c() {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.b);
                builder.setTitle((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bv));
                builder.setMessage((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bw));
                builder.setCancelable(false);
                builder.setPositiveButton((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.by), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.d.a();
                    }
                });
                builder.setNegativeButton((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bx), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.d.b();
                    }
                });
                b.this.c = builder.show();
            }
        });
    }

    public boolean d() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
