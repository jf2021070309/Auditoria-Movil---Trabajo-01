package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {
    private static final Set<d> a = new HashSet();
    private final m b;
    private final com.applovin.impl.sdk.k c;

    private d(long j, com.applovin.impl.sdk.k kVar, final Runnable runnable) {
        this.b = m.a(j, kVar, new Runnable() { // from class: com.applovin.impl.sdk.utils.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.a();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.c = kVar;
        a.add(this);
        kVar.ai().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        kVar.ai().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public static d a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new d(j, kVar, runnable);
    }

    public void a() {
        this.b.d();
        this.c.ai().unregisterReceiver(this);
        a.remove(this);
    }

    public long b() {
        return this.b.a();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.b.b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.b.c();
        }
    }
}
