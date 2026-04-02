package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {
    private final k a;
    private final a b;
    private com.applovin.impl.sdk.utils.m c;
    private final Object d = new Object();
    private long e;

    /* loaded from: classes.dex */
    public interface a {
        void onAdExpired();
    }

    public b(k kVar, a aVar) {
        this.a = kVar;
        this.b = aVar;
    }

    private void b() {
        com.applovin.impl.sdk.utils.m mVar = this.c;
        if (mVar != null) {
            mVar.d();
            this.c = null;
        }
    }

    private void c() {
        synchronized (this.d) {
            b();
        }
    }

    private void d() {
        boolean z;
        synchronized (this.d) {
            long currentTimeMillis = this.e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                a();
                z = true;
            } else {
                a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.b.onAdExpired();
        }
    }

    public void a() {
        synchronized (this.d) {
            b();
            this.a.ai().unregisterReceiver(this);
        }
    }

    public void a(long j) {
        synchronized (this.d) {
            a();
            this.e = System.currentTimeMillis() + j;
            this.a.ai().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            this.a.ai().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            if (((Boolean) this.a.a(com.applovin.impl.sdk.c.a.F)).booleanValue() || !this.a.ab().a()) {
                this.c = com.applovin.impl.sdk.utils.m.a(j, this.a, new Runnable() { // from class: com.applovin.impl.sdk.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a();
                        b.this.b.onAdExpired();
                    }
                });
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            c();
        } else if ("com.applovin.application_resumed".equals(action)) {
            d();
        }
    }
}
