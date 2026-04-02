package com.amazon.aps.iva.n6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.amazon.aps.iva.e.h;
import com.amazon.aps.iva.m6.i;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v1.p;
/* compiled from: RequirementsWatcher.java */
/* loaded from: classes.dex */
public final class c {
    public final Context a;
    public final b b;
    public final com.amazon.aps.iva.n6.b c;
    public final Handler d = g0.n(null);
    public a e;
    public int f;
    public C0531c g;

    /* compiled from: RequirementsWatcher.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                c.this.a();
            }
        }
    }

    /* compiled from: RequirementsWatcher.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: RequirementsWatcher.java */
    /* renamed from: com.amazon.aps.iva.n6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0531c extends ConnectivityManager.NetworkCallback {
        public boolean a;
        public boolean b;

        public C0531c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            c.this.d.post(new p(this, 4));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            if (!z) {
                c.this.d.post(new h(this, 2));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            boolean z = this.a;
            c cVar = c.this;
            if (z && this.b == hasCapability) {
                if (hasCapability) {
                    cVar.d.post(new h(this, 2));
                    return;
                }
                return;
            }
            this.a = true;
            this.b = hasCapability;
            cVar.d.post(new p(this, 4));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            c.this.d.post(new p(this, 4));
        }
    }

    public c(Context context, f0 f0Var, com.amazon.aps.iva.n6.b bVar) {
        this.a = context.getApplicationContext();
        this.b = f0Var;
        this.c = bVar;
    }

    public final void a() {
        int a2 = this.c.a(this.a);
        if (this.f != a2) {
            this.f = a2;
            com.amazon.aps.iva.n6.b bVar = i.o;
            ((i) ((f0) this.b).c).b(this, a2);
        }
    }

    public final int b() {
        boolean z;
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.n6.b bVar = this.c;
        Context context = this.a;
        this.f = bVar.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = bVar.b;
        boolean z4 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (g0.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                C0531c c0531c = new C0531c();
                this.g = c0531c;
                connectivityManager.registerDefaultNetworkCallback(c0531c);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (g0.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i & 16) != 0) {
            z4 = true;
        }
        if (z4) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        a aVar = new a();
        this.e = aVar;
        context.registerReceiver(aVar, intentFilter, null, this.d);
        return this.f;
    }
}
