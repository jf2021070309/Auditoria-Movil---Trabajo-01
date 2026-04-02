package com.amazon.aps.iva.r9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.iva.k9.m;
/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {
    public final a g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.f(intent);
            }
        }
    }

    static {
        m.e("BrdcstRcvrCnstrntTrckr");
    }

    public c(Context context, com.amazon.aps.iva.w9.a aVar) {
        super(context, aVar);
        this.g = new a();
    }

    @Override // com.amazon.aps.iva.r9.d
    public final void c() {
        m c = m.c();
        String.format("%s: registering receiver", getClass().getSimpleName());
        c.a(new Throwable[0]);
        this.b.registerReceiver(this.g, e());
    }

    @Override // com.amazon.aps.iva.r9.d
    public final void d() {
        m c = m.c();
        String.format("%s: unregistering receiver", getClass().getSimpleName());
        c.a(new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
