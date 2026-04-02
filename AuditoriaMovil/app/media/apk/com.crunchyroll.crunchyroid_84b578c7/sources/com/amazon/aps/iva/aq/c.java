package com.amazon.aps.iva.aq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.aq.l;
import com.amazon.aps.iva.e4.l1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: BroadcastReceiverSystemInfoProvider.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yp.a implements m {
    public static final Set<l.a> e = l1.I(l.a.CHARGING, l.a.FULL);
    public static final Set<Integer> f = l1.I(1, 4, 2);
    public final d c = new r();
    public l d = new l(0);

    @Override // com.amazon.aps.iva.aq.m
    public final void a(Context context) {
        if (this.b.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void b(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = context.registerReceiver(this, intentFilter);
        AtomicBoolean atomicBoolean = this.b;
        atomicBoolean.set(true);
        if (registerReceiver != null) {
            onReceive(context, registerReceiver);
        }
        if (this.c.b() >= 21) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            Intent registerReceiver2 = context.registerReceiver(this, intentFilter2);
            atomicBoolean.set(true);
            if (registerReceiver2 != null) {
                onReceive(context, registerReceiver2);
            }
        }
    }

    @Override // com.amazon.aps.iva.aq.m
    public final l d() {
        return this.d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        boolean isPowerSaveMode;
        l.a aVar;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        PowerManager powerManager = null;
        if (intent == null) {
            action = null;
        } else {
            action = intent.getAction();
        }
        if (com.amazon.aps.iva.yb0.j.a(action, "android.intent.action.BATTERY_CHANGED")) {
            int intExtra = intent.getIntExtra("status", 1);
            int intExtra2 = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra3 = intent.getIntExtra("scale", 100);
            int intExtra4 = intent.getIntExtra("plugged", -1);
            l.a.Companion.getClass();
            if (intExtra != 2) {
                if (intExtra != 3) {
                    if (intExtra != 4) {
                        if (intExtra != 5) {
                            aVar = l.a.UNKNOWN;
                        } else {
                            aVar = l.a.FULL;
                        }
                    } else {
                        aVar = l.a.NOT_CHARGING;
                    }
                } else {
                    aVar = l.a.DISCHARGING;
                }
            } else {
                aVar = l.a.CHARGING;
            }
            boolean contains = f.contains(Integer.valueOf(intExtra4));
            this.d = l.a(this.d, e.contains(aVar), (intExtra2 * 100) / intExtra3, false, contains, 4);
        } else if (com.amazon.aps.iva.yb0.j.a(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            if (this.c.b() >= 21) {
                Object systemService = context.getSystemService("power");
                if (systemService instanceof PowerManager) {
                    powerManager = (PowerManager) systemService;
                }
                if (powerManager == null) {
                    isPowerSaveMode = false;
                } else {
                    isPowerSaveMode = powerManager.isPowerSaveMode();
                }
                this.d = l.a(this.d, false, 0, isPowerSaveMode, false, 11);
            }
        } else {
            l1.y(com.amazon.aps.iva.dq.c.a, "Received unknown broadcast intent: [" + action + "]");
        }
    }
}
