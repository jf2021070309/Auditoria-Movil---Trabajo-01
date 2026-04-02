package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {
    public static int a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f4104b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4105c;

    /* renamed from: d  reason: collision with root package name */
    private final m f4106d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<a> f4107e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f4108f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f4109g;

    /* renamed from: h  reason: collision with root package name */
    private int f4110h;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i2);
    }

    public h(m mVar) {
        this.f4106d = mVar;
        Context L = mVar.L();
        this.f4105c = L;
        this.f4104b = (AudioManager) L.getSystemService("audio");
    }

    public static boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private void b() {
        this.f4106d.B().b("AudioSessionManager", "Observing ringer mode...");
        this.f4110h = a;
        this.f4105c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f4106d.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f4106d.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    private void b(final int i2) {
        if (this.f4109g) {
            return;
        }
        v B = this.f4106d.B();
        B.b("AudioSessionManager", "Ringer mode is " + i2);
        synchronized (this.f4108f) {
            for (final a aVar : this.f4107e) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.a(i2);
                    }
                });
            }
        }
    }

    private void c() {
        this.f4106d.B().b("AudioSessionManager", "Stopping observation of mute switch state...");
        this.f4105c.unregisterReceiver(this);
        this.f4106d.aj().unregisterReceiver(this);
    }

    public int a() {
        return this.f4104b.getRingerMode();
    }

    public void a(a aVar) {
        synchronized (this.f4108f) {
            if (this.f4107e.contains(aVar)) {
                return;
            }
            this.f4107e.add(aVar);
            if (this.f4107e.size() == 1) {
                b();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f4108f) {
            if (this.f4107e.contains(aVar)) {
                this.f4107e.remove(aVar);
                if (this.f4107e.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f4104b.getRingerMode());
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f4109g = true;
            this.f4110h = this.f4104b.getRingerMode();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f4109g = false;
            if (this.f4110h != this.f4104b.getRingerMode()) {
                this.f4110h = a;
                b(this.f4104b.getRingerMode());
            }
        }
    }
}
