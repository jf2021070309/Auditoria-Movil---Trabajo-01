package com.amazon.aps.iva.oa0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: BroadcastReceivers.java */
/* loaded from: classes4.dex */
public final class o {
    public static final /* synthetic */ int a = 0;

    /* compiled from: BroadcastReceivers.java */
    /* loaded from: classes4.dex */
    public static class a extends BroadcastReceiver {
        public final u0 a;

        public a(u0 u0Var) {
            this.a = u0Var;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z;
            int i = o.a;
            intent.getAction();
            int i2 = f1.b;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.a.b.c();
            }
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(o.class.getSimpleName());
    }
}
