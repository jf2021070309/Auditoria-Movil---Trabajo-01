package com.amazon.aps.iva.r9;

import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.iva.k9.m;
/* compiled from: StorageNotLowTracker.java */
/* loaded from: classes.dex */
public final class f extends c<Boolean> {
    static {
        m.e("StorageNotLowTracker");
    }

    @Override // com.amazon.aps.iva.r9.d
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, e());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // com.amazon.aps.iva.r9.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                b(Boolean.TRUE);
                return;
            }
            return;
        }
        b(Boolean.FALSE);
    }
}
