package com.amazon.aps.iva.r9;

import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.iva.k9.m;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: BatteryNotLowTracker.java */
/* loaded from: classes.dex */
public final class b extends c<Boolean> {
    static {
        m.e("BatteryNotLowTracker");
    }

    @Override // com.amazon.aps.iva.r9.d
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            m.c().b(new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.amazon.aps.iva.r9.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // com.amazon.aps.iva.r9.c
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m c = m.c();
        String.format("Received %s", intent.getAction());
        c.a(new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                b(Boolean.FALSE);
                return;
            }
            return;
        }
        b(Boolean.TRUE);
    }
}
