package com.applovin.impl.sdk.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class b {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f3905b;

    /* renamed from: c  reason: collision with root package name */
    private AlertDialog f3906c;

    /* renamed from: d  reason: collision with root package name */
    private a f3907d;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public b(Activity activity, m mVar) {
        this.a = mVar;
        this.f3905b = activity;
    }

    public void a() {
        this.f3905b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f3906c != null) {
                    b.this.f3906c.dismiss();
                }
            }
        });
    }

    public void a(final e eVar, final Runnable runnable) {
        this.f3905b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.f3905b);
                builder.setTitle(eVar.aj());
                String ak = eVar.ak();
                if (AppLovinSdkUtils.isValidString(ak)) {
                    builder.setMessage(ak);
                }
                builder.setPositiveButton(eVar.al(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.setCancelable(false);
                b.this.f3906c = builder.show();
            }
        });
    }

    public void a(a aVar) {
        this.f3907d = aVar;
    }

    public void b() {
        this.f3905b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f3906c = new AlertDialog.Builder(b.this.f3905b).setTitle((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bA)).setMessage((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bB)).setCancelable(false).setPositiveButton((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bD), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        b.this.f3907d.a();
                    }
                }).setNegativeButton((CharSequence) b.this.a.a(com.applovin.impl.sdk.c.b.bC), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        b.this.f3907d.b();
                    }
                }).show();
            }
        });
    }

    public boolean c() {
        AlertDialog alertDialog = this.f3906c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
