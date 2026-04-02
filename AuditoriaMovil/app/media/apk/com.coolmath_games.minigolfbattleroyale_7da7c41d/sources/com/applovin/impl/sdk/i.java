package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements AppLovinBroadcastManager.Receiver {
    private static AlertDialog b;
    private static final AtomicBoolean c = new AtomicBoolean();
    private final j a;
    private com.applovin.impl.sdk.utils.m d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.sdk.i$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ k a;
        final /* synthetic */ a b;

        AnonymousClass1(k kVar, a aVar) {
            this.a = kVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r z;
            String str;
            if (i.this.a.c()) {
                this.a.z().e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            Activity a = this.a.ad().a();
            if (a != null && com.applovin.impl.sdk.utils.g.a(this.a.J())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.i.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog unused = i.b = new AlertDialog.Builder(AnonymousClass1.this.a.ad().a()).setTitle((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aC)).setMessage((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aD)).setCancelable(false).setPositiveButton((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aE), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.i.1.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                AnonymousClass1.this.b.a();
                                dialogInterface.dismiss();
                                i.c.set(false);
                            }
                        }).setNegativeButton((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aF), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.i.1.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                AnonymousClass1.this.b.b();
                                dialogInterface.dismiss();
                                i.c.set(false);
                                i.this.a(((Long) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aA)).longValue(), AnonymousClass1.this.a, AnonymousClass1.this.b);
                            }
                        }).create();
                        i.b.show();
                    }
                });
                return;
            }
            if (a == null) {
                z = this.a.z();
                str = "No parent Activity found - rescheduling consent alert...";
            } else {
                z = this.a.z();
                str = "No internet available - rescheduling consent alert...";
            }
            z.e("ConsentAlertManager", str);
            i.c.set(false);
            i.this.a(((Long) this.a.a(com.applovin.impl.sdk.c.b.aB)).longValue(), this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j jVar, k kVar) {
        this.a = jVar;
        kVar.ai().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        kVar.ai().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void a(long j, k kVar, a aVar) {
        if (j <= 0) {
            return;
        }
        AlertDialog alertDialog = b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (c.getAndSet(true)) {
                if (j >= this.d.a()) {
                    r z = kVar.z();
                    z.d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.d.a() + " milliseconds");
                    return;
                }
                r z2 = kVar.z();
                z2.b("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.d.a() + "ms)");
                this.d.d();
            }
            r z3 = kVar.z();
            z3.b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
            this.d = com.applovin.impl.sdk.utils.m.a(j, kVar, new AnonymousClass1(kVar, aVar));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.d == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.d.b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.d.c();
        }
    }
}
