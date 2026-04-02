package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3887b;

    /* renamed from: c  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.n f3888c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3889d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private long f3890e;

    /* loaded from: classes.dex */
    public interface a {
        void onAdExpired();
    }

    public b(m mVar, a aVar) {
        this.a = mVar;
        this.f3887b = aVar;
    }

    private void b() {
        com.applovin.impl.sdk.utils.n nVar = this.f3888c;
        if (nVar != null) {
            nVar.d();
            this.f3888c = null;
        }
    }

    private void c() {
        synchronized (this.f3889d) {
            b();
        }
    }

    private void d() {
        boolean z;
        synchronized (this.f3889d) {
            long currentTimeMillis = this.f3890e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                a();
                z = true;
            } else {
                a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f3887b.onAdExpired();
        }
    }

    public void a() {
        synchronized (this.f3889d) {
            b();
            this.a.aj().unregisterReceiver(this);
        }
    }

    public void a(long j2) {
        synchronized (this.f3889d) {
            a();
            this.f3890e = System.currentTimeMillis() + j2;
            this.a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            this.a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            if (((Boolean) this.a.a(com.applovin.impl.sdk.c.a.I)).booleanValue() || !this.a.ac().a()) {
                this.f3888c = com.applovin.impl.sdk.utils.n.a(j2, this.a, new Runnable() { // from class: com.applovin.impl.sdk.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a();
                        b.this.f3887b.onAdExpired();
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
