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
/* loaded from: classes.dex */
public class k implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b  reason: collision with root package name */
    private static AlertDialog f4117b;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f4118c = new AtomicBoolean();
    private final l a;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.n f4119d;

    /* renamed from: com.applovin.impl.sdk.k$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ m a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f4120b;

        public AnonymousClass1(m mVar, a aVar) {
            this.a = mVar;
            this.f4120b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            v B;
            String str;
            if (k.this.a.d()) {
                this.a.B().e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            Activity a = this.a.ae().a();
            if (a != null && com.applovin.impl.sdk.utils.h.a(this.a.L())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog unused = k.f4117b = new AlertDialog.Builder(AnonymousClass1.this.a.ae().a()).setTitle((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aL)).setMessage((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aM)).setCancelable(false).setPositiveButton((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aN), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.k.1.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                AnonymousClass1.this.f4120b.a();
                                dialogInterface.dismiss();
                                k.f4118c.set(false);
                            }
                        }).setNegativeButton((CharSequence) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aO), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.k.1.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                AnonymousClass1.this.f4120b.b();
                                dialogInterface.dismiss();
                                k.f4118c.set(false);
                                long longValue = ((Long) AnonymousClass1.this.a.a(com.applovin.impl.sdk.c.b.aJ)).longValue();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                k.this.a(longValue, anonymousClass1.a, anonymousClass1.f4120b);
                            }
                        }).create();
                        k.f4117b.show();
                    }
                });
                return;
            }
            if (a == null) {
                B = this.a.B();
                str = "No parent Activity found - rescheduling consent alert...";
            } else {
                B = this.a.B();
                str = "No internet available - rescheduling consent alert...";
            }
            B.e("ConsentAlertManager", str);
            k.f4118c.set(false);
            k.this.a(((Long) this.a.a(com.applovin.impl.sdk.c.b.aK)).longValue(), this.a, this.f4120b);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public k(l lVar, m mVar) {
        this.a = lVar;
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void a(long j2, m mVar, a aVar) {
        if (j2 <= 0) {
            return;
        }
        AlertDialog alertDialog = f4117b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (f4118c.getAndSet(true)) {
                if (j2 >= this.f4119d.a()) {
                    v B = mVar.B();
                    StringBuilder y = e.a.d.a.a.y("Skip scheduling consent alert - one scheduled already with remaining time of ");
                    y.append(this.f4119d.a());
                    y.append(" milliseconds");
                    B.d("ConsentAlertManager", y.toString());
                    return;
                }
                v B2 = mVar.B();
                B2.b("ConsentAlertManager", "Scheduling consent alert earlier (" + j2 + "ms) than remaining scheduled time (" + this.f4119d.a() + "ms)");
                this.f4119d.d();
            }
            v B3 = mVar.B();
            B3.b("ConsentAlertManager", "Scheduling consent alert for " + j2 + " milliseconds");
            this.f4119d = com.applovin.impl.sdk.utils.n.a(j2, mVar, new AnonymousClass1(mVar, aVar));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.f4119d == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f4119d.b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f4119d.c();
        }
    }
}
