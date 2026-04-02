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
public class f extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {
    public static int a = -1;
    private final AudioManager b;
    private final Context c;
    private final k d;
    private final Set<a> e = new HashSet();
    private final Object f = new Object();
    private boolean g;
    private int h;

    /* loaded from: classes.dex */
    public interface a {
        void onRingerModeChanged(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(k kVar) {
        this.d = kVar;
        Context J = kVar.J();
        this.c = J;
        this.b = (AudioManager) J.getSystemService("audio");
    }

    public static boolean a(int i) {
        return i == 0 || i == 1;
    }

    private void b() {
        this.d.z().b("AudioSessionManager", "Observing ringer mode...");
        this.h = a;
        this.c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.d.ai().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.d.ai().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    private void b(final int i) {
        if (this.g) {
            return;
        }
        r z = this.d.z();
        z.b("AudioSessionManager", "Ringer mode is " + i);
        synchronized (this.f) {
            for (final a aVar : this.e) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.f.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.onRingerModeChanged(i);
                    }
                });
            }
        }
    }

    private void c() {
        this.d.z().b("AudioSessionManager", "Stopping observation of mute switch state...");
        this.c.unregisterReceiver(this);
        this.d.ai().unregisterReceiver(this);
    }

    public int a() {
        return this.b.getRingerMode();
    }

    public void a(a aVar) {
        synchronized (this.f) {
            if (this.e.contains(aVar)) {
                return;
            }
            this.e.add(aVar);
            if (this.e.size() == 1) {
                b();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f) {
            if (this.e.contains(aVar)) {
                this.e.remove(aVar);
                if (this.e.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.b.getRingerMode());
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.g = true;
            this.h = this.b.getRingerMode();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.g = false;
            if (this.h != this.b.getRingerMode()) {
                this.h = a;
                b(this.b.getRingerMode());
            }
        }
    }
}
